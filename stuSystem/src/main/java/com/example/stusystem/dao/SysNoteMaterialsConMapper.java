package com.example.stusystem.dao;

import com.example.stusystem.model.SysNoteMaterialsCon;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SysNoteMaterialsConMapper {
    int insert(SysNoteMaterialsCon row);

    List<SysNoteMaterialsCon> selectAll();
}