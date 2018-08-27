package com.iason.configserver.controller;

import com.iason.configserver.config.DataSourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Iason on 2018/8/27.
 */
@RestController
public class MyController {
	@Autowired
	private DataSourceConfig dataSourceConfig;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello () {
		System.out.println("username===" + dataSourceConfig.getUserName());
		System.out.println("password===" + dataSourceConfig.getPassWord());
		return "hello";
	}
}
