package cn.com.lanou.dao;

import cn.com.lanou.domain.UserRoleKey;


public interface UserRoleMapper {

	void addUserRoleKey(UserRoleKey userRoleKey);

	void deleteUserRoleKey(UserRoleKey userRole);

	void deleteAllByUserId(int[] userids);
    
}