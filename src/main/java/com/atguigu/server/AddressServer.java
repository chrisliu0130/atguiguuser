package com.atguigu.server;

import javax.jws.WebService;

import com.atguigu.bean.T_MALL_ADDRESS;
import com.atguigu.bean.T_MALL_USER_ACCOUNT;

@WebService
public interface AddressServer {

	public String getAddress(T_MALL_USER_ACCOUNT user);

	public String addAddress(T_MALL_ADDRESS address);
	
	
}
