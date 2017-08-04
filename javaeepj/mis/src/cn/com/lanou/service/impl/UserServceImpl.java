package cn.com.lanou.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.lanou.dao.UserMapper;
import cn.com.lanou.dao.UserRoleMapper;
import cn.com.lanou.domain.PageView;
import cn.com.lanou.domain.User;
import cn.com.lanou.domain.UserRoleKey;
import cn.com.lanou.service.UserService;

@Service
public class UserServceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Resource
	private UserRoleMapper userRoleMapper;
	
	@Override
	public Map getUserByUserName(String username) {
		return userMapper.getUserByUserName(username);
	}

	@Override
	public PageView getUsersByPageNow(PageView pageView,User user) {
		long rowCount = userMapper.getRowCount(user);
		
		int pageSize = pageView.getPageSize();
		
		long pageCount = rowCount%pageSize == 0 ? rowCount/pageSize : (rowCount/pageSize+1);
		
		long pageNow = pageView.getPageNow();
		
		Map map = new HashMap();
		map.put("username", user.getUsername());
		map.put("usernickname", user.getUsernickname());
		map.put("pageSize", pageSize);
		map.put("pageNow", (pageNow-1)*pageSize);
		List users = userMapper.getUsersPage(map);
		
		pageView.setRecords(users);
		pageView.setRowCount(rowCount);
		pageView.setPageCount(pageCount);
		pageView.setPageNow(pageNow+1);
		
		return pageView;
	}

	@Override
	public void updateLastLogintime(String username) {
		userMapper.updateLastLogintime(username);
	}

	@Override
	public void deleteUser(String userId) {
		userMapper.deleteUser(Integer.parseInt(userId));
		UserRoleKey userRole = new UserRoleKey();
		userRole.setUserId(Long.parseLong(userId));
		userRoleMapper.deleteUserRoleKey(userRole);
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	@Override
	public void addUser(User user) {
		userMapper.addUser(user);
	}

	@Override
	public void deleteAll(int[] userids) {
		userMapper.deleteAll(userids);
		userRoleMapper.deleteAllByUserId(userids);
	}

}
