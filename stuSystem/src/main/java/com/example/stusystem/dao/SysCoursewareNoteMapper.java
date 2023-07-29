package com.example.stusystem.dao;

import com.example.stusystem.model.SysCoursewareNote;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SysCoursewareNoteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysCoursewareNote row);

    SysCoursewareNote selectByPrimaryKey(Integer id);

    List<SysCoursewareNote> selectAll();

    int updateByPrimaryKey(SysCoursewareNote row);
}