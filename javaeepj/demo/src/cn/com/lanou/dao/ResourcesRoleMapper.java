package cn.com.lanou.dao;

import cn.com.lanou.domain.ResourcesRoleExample;
import cn.com.lanou.domain.ResourcesRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourcesRoleMapper {
    int countByExample(ResourcesRoleExample example);

    int deleteByExample(ResourcesRoleExample example);

    int deleteByPrimaryKey(ResourcesRoleKey key);

    int insert(ResourcesRoleKey record);

    int insertSelective(ResourcesRoleKey record);

    List<ResourcesRoleKey> selectByExample(ResourcesRoleExample example);

    int updateByExampleSelective(@Param("record") ResourcesRoleKey record, @Param("example") ResourcesRoleExample example);

    int updateByExample(@Param("record") ResourcesRoleKey record, @Param("example") ResourcesRoleExample example);
}