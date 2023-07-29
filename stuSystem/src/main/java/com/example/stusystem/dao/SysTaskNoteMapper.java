package com.example.stusystem.dao;

import com.example.stusystem.model.SysTaskNote;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SysTaskNoteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysTaskNote row);

    SysTaskNote selectByPrimaryKey(Integer id);

    List<SysTaskNote> selectAll();

    int updateByPrimaryKey(SysTaskNote row);
}