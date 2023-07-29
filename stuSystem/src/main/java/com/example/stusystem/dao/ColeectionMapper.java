package com.example.stusystem.dao;

import com.example.stusystem.model.Coleection;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ColeectionMapper {
    int insert(Coleection row);

    List<Coleection> selectAll();
}