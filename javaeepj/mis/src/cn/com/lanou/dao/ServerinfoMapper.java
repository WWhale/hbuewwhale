package cn.com.lanou.dao;

import cn.com.lanou.domain.Serverinfo;
import cn.com.lanou.domain.ServerinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServerinfoMapper {
    int countByExample(ServerinfoExample example);

    int deleteByExample(ServerinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Serverinfo record);

    int insertSelective(Serverinfo record);

    List<Serverinfo> selectByExample(ServerinfoExample example);

    Serverinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Serverinfo record, @Param("example") ServerinfoExample example);

    int updateByExample(@Param("record") Serverinfo record, @Param("example") ServerinfoExample example);

    int updateByPrimaryKeySelective(Serverinfo record);

    int updateByPrimaryKey(Serverinfo record);
}