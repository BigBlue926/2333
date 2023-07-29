package com.example.stusystem.dao;

import com.example.stusystem.model.StuUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface StuUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StuUser row);

    StuUser selectByPrimaryKey(Integer id);

    List<StuUser> selectAll();

    int updateByPrimaryKey(StuUser row);

    @Select("select username,password from stu_user where stu_number = #{name} and password = #{password} ")
    StuUser getByUsernameAndPassword(StuUser user);
}