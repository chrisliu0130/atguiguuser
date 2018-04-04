package com.atguigu.serverimpl;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;

import com.atguigu.bean.T_MALL_ADDRESS;
import com.atguigu.bean.T_MALL_USER_ACCOUNT;
import com.atguigu.service.AddressService;
import com.google.gson.Gson;

public class AddressServerImpl implements com.atguigu.server.AddressServer {

	@Autowired
	AddressService addressService;

	@Override
	@Path("getAddress")
	@GET
	@Consumes("application/x-www-form-urlencoded")
	@Produces("application/json")
	public String getAddress(@BeanParam T_MALL_USER_ACCOUNT user) {
		T_MALL_ADDRESS address = addressService.getAddress(user);

		Gson gson = new Gson();
		String json = gson.toJson(address);
		return json;
	}

	@Override
	@Path("addAddress")
	@GET
	@Consumes("application/x-www-form-urlencoded")
	@Produces("text/html")
	public String addAddress(@BeanParam T_MALL_ADDRESS address) {
		int i = addressService.addAddress(address);
		String s = i + "";
		return s;
	}

}
