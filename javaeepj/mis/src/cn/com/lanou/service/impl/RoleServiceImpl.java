package cn.com.lanou.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.lanou.dao.RoleMapper;
import cn.com.lanou.domain.Role;
import cn.com.lanou.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Resource
	private RoleMapper roleMapper;

	@Override
	public List<Role> getAll() {
		return roleMapper.getAll();
	}
	
	
}
