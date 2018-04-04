package com.atguigu.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.T_MALL_ADDRESS;
import com.atguigu.bean.T_MALL_USER_ACCOUNT;
import com.atguigu.dao.AddressDao;
import com.atguigu.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressDao addressDao;

	@Override
	public int addAddress(T_MALL_ADDRESS address) {
		return addressDao.addAddress(address);
	}

	@Override
	public T_MALL_ADDRESS getAddress(T_MALL_USER_ACCOUNT user) {
		T_MALL_ADDRESS address = addressDao.getAddress(user);
		return address;
	}

}
