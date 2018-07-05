package com.victoria.xshop.framework.aspectj;

import com.alibaba.fastjson.JSONObject;
import com.victoria.xshop.common.utils.LogUtils;
import com.victoria.xshop.common.utils.ServletUtils;
import com.victoria.xshop.common.utils.security.ShiroUtils;
import com.victoria.xshop.framework.aspectj.lang.annotation.SysLog;
import com.victoria.xshop.model.User;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * 操作日志记录处理
 *
 * @author ruoyi
 */

@Aspect
@Component
@Slf4j
public class SysLogAspect
{


    // 配置织入点
    @Pointcut("@annotation(com.victoria.xshop.framework.aspectj.lang.annotation.SysLog)")
    public void logPointCut()
    {
    }

    /**
     * 前置通知 用于拦截操作
     *
     * @param joinPoint 切点
     */
    @AfterReturning(pointcut = "logPointCut()")
    public void doBefore(JoinPoint joinPoint)
    {
        handleLog(joinPoint, null);
    }

    /**
     * 拦截异常操作
     *
     * @param joinPoint
     * @param e
     */
    @AfterThrowing(value = "logPointCut()", throwing = "e")
    public void doAfter(JoinPoint joinPoint, Exception e)
    {
        handleLog(joinPoint, e);
    }

    private void handleLog(JoinPoint joinPoint, Exception e)
    {
        try
        {
            HttpServletRequest request = ServletUtils.getHttpServletRequest();
            SysLog sysLog = getAnnotationLog(joinPoint);
            LogUtils.logAccess(sysLog, request);


//            // 获得注解
//            Log controllerLog = getAnnotationLog(joinPoint);
//            if (controllerLog == null)
//            {
//                return;
//            }
//
//            // 获取当前的用户
//            User currentUser = ShiroUtils.getUser();
//
//            // *========数据库日志=========*//
//            OperLog operLog = new OperLog();
//            operLog.setStatus(UserConstants.NORMAL);
//            // 请求的地址
//            String ip = ShiroUtils.getIp();
//            operLog.setOperIp(ip);
//            operLog.setOperUrl(ServletUtils.getHttpServletRequest().getRequestURI());
//            if (currentUser != null)
//            {
//                operLog.setLoginName(currentUser.getLoginName());
//                operLog.setDeptName(currentUser.getDept().getDeptName());
//            }
//
//            if (e != null)
//            {
//                operLog.setStatus(UserConstants.EXCEPTION);
//                operLog.setErrorMsg(e.getMessage());
//            }
//            // 设置方法名称
//            String className = joinPoint.getTarget().getClass().getName();
//            String methodName = joinPoint.getSignature().getName();
//            operLog.setMethod(className + "." + methodName + "()");
//            // 处理设置注解上的参数
//            getControllerMethodDescription(controllerLog, operLog);
//            // 保存数据库
//            operLogService.insertOperlog(operLog);
        }
        catch (Exception exp)
        {
            // 记录本地异常日志
            log.error("==前置通知异常==");
            log.error("异常信息:{}", exp.getMessage());
            exp.printStackTrace();
        }
    }

    /**
     * 获取注解中对方法的描述信息 用于Controller层注解
     *
     * @param joinPoint 切点
     * @return 方法描述
     * @throws Exception
     */
//    public static void getControllerMethodDescription(Log log, OperLog operLog) throws Exception
//    {
//        // 设置action动作
//        operLog.setAction(log.action());
//        // 设置标题
//        operLog.setTitle(log.title());
//        // 设置channel
//        operLog.setChannel(log.channel());
//        // 是否需要保存request，参数和值
//        if (log.isSaveRequestData())
//        {
//            // 获取参数的信息，传入到数据库中。
//            setRequestValue(operLog);
//        }
//    }

    /**
     * 获取请求的参数，放到log中
     *
     * @param operLog
     * @param request
     */
//    private static void setRequestValue(OperLog operLog)
//    {
//        Map<String, String[]> map = ServletUtils.getHttpServletRequest().getParameterMap();
//        String params = JSONObject.toJSONString(map);
//        operLog.setOperParam(params);
//    }

    /**
     * 是否存在注解，如果存在就获取
     */
    private static SysLog getAnnotationLog(JoinPoint joinPoint) throws Exception
    {
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();

        if (method != null)
        {
            return method.getAnnotation(SysLog.class);
        }
        return null;
    }
}
