package net.sendcloud.dao.mapper;


import net.sendcloud.model.sys.SysApi;
import net.sendcloud.model.sys.SysApiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 */
public interface SysApiMapper {
    long countByExample(SysApiExample example);

    int deleteByExample(SysApiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysApi record);

    int insertSelective(SysApi record);

    List<SysApi> selectByExample(SysApiExample example);

    SysApi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysApi record, @Param("example") SysApiExample example);

    int updateByExample(@Param("record") SysApi record, @Param("example") SysApiExample example);

    int updateByPrimaryKeySelective(SysApi record);

    int updateByPrimaryKey(SysApi record);
}