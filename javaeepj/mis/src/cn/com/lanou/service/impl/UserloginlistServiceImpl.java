package cn.com.lanou.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.lanou.dao.UserloginlistMapper;
import cn.com.lanou.domain.Userloginlist;
import cn.com.lanou.service.UserloginlistService;

@Service
public class UserloginlistServiceImpl implements UserloginlistService {

	@Resource
	private UserloginlistMapper userloginlistMapper;

	@Override
	public void insertUserloginlist(Userloginlist userloginlist) {
		userloginlistMapper.insertUserloginlist(userloginlist);
	}
}
