package com.example.stusystem.dao;

import com.example.stusystem.model.SysUserTaskCon;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SysUserTaskConMapper {
    int insert(SysUserTaskCon row);

    List<SysUserTaskCon> selectAll();
}