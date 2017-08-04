package cn.com.mymis.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.mymis.dao.UserMapper;
import cn.com.mymis.domain.User;
import cn.com.mymis.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper UserMapper;
	
	@Override
	public User selectUserById(int id) {
		User user = UserMapper.selectUserById(id);
		return user;
	}
	
}
