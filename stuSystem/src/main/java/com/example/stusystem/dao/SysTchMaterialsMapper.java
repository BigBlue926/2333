package com.example.stusystem.dao;

import com.example.stusystem.model.SysTchMaterials;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SysTchMaterialsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysTchMaterials row);

    SysTchMaterials selectByPrimaryKey(Integer id);

    List<SysTchMaterials> selectAll();

    int updateByPrimaryKey(SysTchMaterials row);
}