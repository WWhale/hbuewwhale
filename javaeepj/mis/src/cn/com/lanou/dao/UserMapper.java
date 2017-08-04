package cn.com.lanou.dao;

import java.util.List;
import java.util.Map;

import cn.com.lanou.domain.User;

public interface UserMapper {

	Map getUserByUserName(String username);

	long getRowCount(User user);

	List getUsersPage(Map map);

	void updateLastLogintime(String username);

	void deleteUser(int userId);

	void updateUser(User user);

	void addUser(User user);

	void deleteAll(int[] userids);

    

}