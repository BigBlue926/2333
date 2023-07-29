package com.example.stusystem.dao;

import com.example.stusystem.model.SysCourseware;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysCoursewareMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysCourseware row);

    SysCourseware selectByPrimaryKey(Integer id);

    List<SysCourseware> selectAll();

    int updateByPrimaryKey(SysCourseware row);
}