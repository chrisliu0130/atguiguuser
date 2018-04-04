package com.atguigu.serverimpl;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;

import com.atguigu.bean.T_MALL_USER_ACCOUNT;
import com.atguigu.server.RegistServer;
import com.atguigu.service.RegistService;

public class RegistServerImpl implements RegistServer {

	@Autowired
	RegistService registService;

	@Override
	@Path("regist")
	@GET
	@Consumes("application/x-www-form-urlencoded")
	@Produces("text/html")
	public String regist(@BeanParam T_MALL_USER_ACCOUNT user) {
		int i = registService.regist(user);
		String s = i + "";
		return s;
	}

}
