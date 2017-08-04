package cn.com.lanou.dao;

import cn.com.lanou.domain.Resources;
import java.util.List;

public interface ResourcesMapper {
	List<Resources> getResourcesByUserName(String username);
}