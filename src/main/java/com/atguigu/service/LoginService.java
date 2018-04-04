package com.atguigu.service;

import com.atguigu.bean.T_MALL_USER_ACCOUNT;

public interface LoginService {

	T_MALL_USER_ACCOUNT select_user(T_MALL_USER_ACCOUNT user);
	
	
}
