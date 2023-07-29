package com.example.stusystem.dao;

import com.example.stusystem.model.SysNoteCoursewareCon;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SysNoteCoursewareConMapper {
    int insert(SysNoteCoursewareCon row);

    List<SysNoteCoursewareCon> selectAll();
}