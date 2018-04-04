package com.atguigu.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.T_MALL_USER_ACCOUNT;
import com.atguigu.dao.RegistDao;
import com.atguigu.service.RegistService;

@Service
public class RegistServiceImpl implements RegistService {

	@Autowired
	RegistDao registDao;

	@Override
	public int regist(T_MALL_USER_ACCOUNT user) {

		return registDao.regist(user);
	}

}
