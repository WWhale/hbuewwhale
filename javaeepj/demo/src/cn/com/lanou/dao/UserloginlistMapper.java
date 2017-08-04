package cn.com.lanou.dao;

import cn.com.lanou.domain.Userloginlist;
import cn.com.lanou.domain.UserloginlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserloginlistMapper {
    int countByExample(UserloginlistExample example);

    int deleteByExample(UserloginlistExample example);

    int deleteByPrimaryKey(Integer loginid);

    int insert(Userloginlist record);

    int insertSelective(Userloginlist record);

    List<Userloginlist> selectByExample(UserloginlistExample example);

    Userloginlist selectByPrimaryKey(Integer loginid);

    int updateByExampleSelective(@Param("record") Userloginlist record, @Param("example") UserloginlistExample example);

    int updateByExample(@Param("record") Userloginlist record, @Param("example") UserloginlistExample example);

    int updateByPrimaryKeySelective(Userloginlist record);

    int updateByPrimaryKey(Userloginlist record);
}