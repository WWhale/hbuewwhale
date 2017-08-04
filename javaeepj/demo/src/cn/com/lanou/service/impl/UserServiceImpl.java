package cn.com.lanou.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.lanou.dao.UserMapper;
import cn.com.lanou.domain.User;
import cn.com.lanou.service.UserService;
import cn.com.lanou.util.PageView;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public PageView query(PageView pageView, User user) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("pageNow", pageView.getPageNow() -1);
		map.put("pageSize", pageView.getPageSize());
		
		long rowCount = userMapper.getUsersPagesCount(); 
		List<Map> list = userMapper.getUsersPages(map);
		
		long pageCount = rowCount%pageView.getPageSize() == 0 ? rowCount/pageView.getPageSize() : (rowCount/pageView.getPageSize()+1);
		
		pageView.setRecords(list);
		pageView.setPageCount(pageCount);
		pageView.setRowCount(rowCount);
		
		
		return pageView;
	}
}
