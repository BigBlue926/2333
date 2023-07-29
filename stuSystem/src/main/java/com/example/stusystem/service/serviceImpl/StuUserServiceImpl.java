package com.example.stusystem.service.serviceImpl;


import com.example.stusystem.dao.StuUserMapper;
import com.example.stusystem.model.StuUser;
import com.example.stusystem.service.StuUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuUserServiceImpl implements StuUserService {

    @Autowired
    private StuUserMapper stuUserMapper;

    @Override
    public StuUser login(StuUser user) {
        return stuUserMapper.getByUsernameAndPassword(user);
    }
}
