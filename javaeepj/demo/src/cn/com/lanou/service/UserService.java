package cn.com.lanou.service;

import cn.com.lanou.domain.User;
import cn.com.lanou.util.PageView;

public interface UserService {

	PageView query(PageView pageView, User user);

}
