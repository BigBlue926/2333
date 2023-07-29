package com.example.stusystem.dao;

import com.example.stusystem.model.SysMaterialsNote;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysMaterialsNoteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysMaterialsNote row);

    SysMaterialsNote selectByPrimaryKey(Integer id);

    List<SysMaterialsNote> selectAll();

    int updateByPrimaryKey(SysMaterialsNote row);
}