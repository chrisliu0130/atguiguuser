package com.atguigu.service;

import com.atguigu.bean.T_MALL_ADDRESS;
import com.atguigu.bean.T_MALL_USER_ACCOUNT;

public interface AddressService {

	 int addAddress(T_MALL_ADDRESS address);

	 T_MALL_ADDRESS getAddress(T_MALL_USER_ACCOUNT user);

}
