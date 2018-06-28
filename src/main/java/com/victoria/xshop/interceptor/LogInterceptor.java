package com.victoria.xshop.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.UUID;

@Component
public class LogInterceptor implements HandlerInterceptor {

    private static final Logger LOGGER
            = LoggerFactory.getLogger("access");

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logBaseRequest(request);
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        if(!"POST".equals(request.getMethod())){
            return ;
        }

        String uuid = logBaseRequest(request);

        LOGGER.info("[{}]vistor request body:", uuid);
        StringBuffer body = new StringBuffer();
        try {
            InputStream is = request.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is,
                    "utf-8"));
            String s = "";
            while ((s = br.readLine()) != null) {
                body.append(s);
            }
            LOGGER.info(body.toString());
        } catch (UnsupportedEncodingException e) {
            LOGGER.error("", e);
        } catch (IOException e) {
            LOGGER.error("", e);
        }
    }


    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }


    private String logBaseRequest(HttpServletRequest request) {
        String uuid = UUID.randomUUID().toString();
        LOGGER.info("[{}]vistor host: {}:{}", uuid, request.getRemoteHost() , request.getRemotePort());
        LOGGER.info("[{}]vistor url:{} {}", uuid, request.getMethod(), request.getRequestURL().toString());

        Enumeration headerNames = request.getHeaderNames();
        StringBuilder header = new StringBuilder();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);
            header.append(key).append(":").append(value).append("\n");
        }
        if(header.length() > 1){
            header.delete(header.length() - 1 , header.length());
            LOGGER.info("[{}]vistor request header:\n{}", uuid, header.toString());
        }

        Enumeration paramNames = request.getParameterNames();
        StringBuilder params = new StringBuilder();
        while (paramNames.hasMoreElements()) {
            String paramName = (String) paramNames.nextElement();
            String[] paramValues = request.getParameterValues(paramName);
            params.append(paramName).append(":").append(paramValues.length == 1 ? paramValues[0] : Arrays.toString(paramValues)).append("\n");

        }
        if(params.length() > 1){
            params.delete(params.length() - 1 , params.length());
            LOGGER.info("[{}]vistor request params:\n{}", uuid, params.toString());
        }

        return uuid;
    }
}
