package cn.com.lanou.service;

import java.util.Map;

import cn.com.lanou.domain.PageView;
import cn.com.lanou.domain.User;

public interface UserService {

	Map getUserByUserName(String username);

	PageView getUsersByPageNow(PageView pageView,User user);

	void updateLastLogintime(String username);

	void deleteUser(String userName);

	void updateUser(User user);

	void addUser(User user);

	void deleteAll(int[] userids);


}
