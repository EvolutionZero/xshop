package com.victoria.xshop.project.goods.controller;

import com.victoria.xshop.project.goods.model.entity.ActivityInfo;
import com.victoria.xshop.project.goods.service.ActiviyInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/activity_info")
public class ActivityInfoController extends BaseControllerImpl<ActiviyInfoService, ActivityInfo>{
}
