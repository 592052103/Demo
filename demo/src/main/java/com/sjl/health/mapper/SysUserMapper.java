package com.sjl.health.mapper;

import com.sjl.health.entity.SysUser;

public interface SysUserMapper {
	
    int deleteByPrimaryKey(Long userId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    
    SysUser selectByUserName(String userName);
}