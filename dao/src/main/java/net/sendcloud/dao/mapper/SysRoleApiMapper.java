package net.sendcloud.dao.mapper;

import net.sendcloud.model.sys.SysRoleApi;
import net.sendcloud.model.sys.SysRoleApiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysRoleApiMapper {
    long countByExample(SysRoleApiExample example);

    int deleteByExample(SysRoleApiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleApi record);

    int insertSelective(SysRoleApi record);

    List<SysRoleApi> selectByExample(SysRoleApiExample example);

    SysRoleApi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRoleApi record, @Param("example") SysRoleApiExample example);

    int updateByExample(@Param("record") SysRoleApi record, @Param("example") SysRoleApiExample example);

    int updateByPrimaryKeySelective(SysRoleApi record);

    int updateByPrimaryKey(SysRoleApi record);
}