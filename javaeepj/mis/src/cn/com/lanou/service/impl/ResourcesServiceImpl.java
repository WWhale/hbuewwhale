package cn.com.lanou.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.lanou.dao.ResourcesMapper;
import cn.com.lanou.domain.Resources;
import cn.com.lanou.service.ResourcesService;
@Service
public class ResourcesServiceImpl implements ResourcesService {
	
	@Resource
	private ResourcesMapper resourcesMapper;

	@Override
	public List<Resources> getResourcesByUserName(String username) {
		return resourcesMapper.getResourcesByUserName(username);
	}
}
