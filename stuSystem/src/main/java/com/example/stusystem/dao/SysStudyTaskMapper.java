package com.example.stusystem.dao;

import com.example.stusystem.model.SysStudyTask;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SysStudyTaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysStudyTask row);

    SysStudyTask selectByPrimaryKey(Integer id);

    List<SysStudyTask> selectAll();

    int updateByPrimaryKey(SysStudyTask row);
}