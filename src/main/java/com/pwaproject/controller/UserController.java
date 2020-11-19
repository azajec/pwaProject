package com.pwaproject.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.PropertySource;

import com.pwaproject.controller.base.UserBaseController;

@RestController
@PropertySource("classpath:${configfile.path}/pwaProject.properties")
@RequestMapping(value="${endpoint.api}", headers = "Accept=application/json")
public class UserController extends UserBaseController {

	//OVERRIDE HERE YOUR CUSTOM CONTROLLER

}
