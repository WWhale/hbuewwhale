package cn.com.lanou.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.lanou.dao.UserRoleMapper;
import cn.com.lanou.domain.UserRoleKey;
import cn.com.lanou.service.UserRoleKeyService;

@Service
public class UserRoleKeyServiceImpl implements UserRoleKeyService {

	@Resource
	private UserRoleMapper userRoleMapper;

	@Override
	public void addUserRoleKey(UserRoleKey userRoleKey) {
		UserRoleKey userRole = new UserRoleKey();
		userRole.setUserId(userRoleKey.getUserId());
		userRoleMapper.deleteUserRoleKey(userRole);
		userRoleMapper.addUserRoleKey(userRoleKey);
	}
}
