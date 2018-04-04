package com.atguigu.serverimpl;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;

import com.atguigu.bean.T_MALL_USER_ACCOUNT;
import com.atguigu.server.LoginServer;
import com.atguigu.service.LoginService;
import com.google.gson.Gson;

public class LoginServerImpl implements LoginServer {

	@Autowired
	LoginService loginService;

	@Override
	@Path("login")
	@GET
	@Consumes("application/x-www-form-urlencoded")
	@Produces("application/json")
	public String login(@BeanParam T_MALL_USER_ACCOUNT user) {

		T_MALL_USER_ACCOUNT login_user = loginService.select_user(user);

		Gson gson = new Gson();
		String json = gson.toJson(login_user);

		return json;
	}

}
