package com.atguigu.server;

import javax.jws.WebService;

import com.atguigu.bean.T_MALL_USER_ACCOUNT;

@WebService
public interface RegistServer {

	public String regist(T_MALL_USER_ACCOUNT user);

}
