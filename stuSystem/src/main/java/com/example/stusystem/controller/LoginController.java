package com.example.stusystem.controller;

import com.example.stusystem.common.Result;
import com.example.stusystem.common.enums.AppHttpCodeEnum;
import com.example.stusystem.model.StuUser;
import com.example.stusystem.service.StuUserService;
import com.example.stusystem.util.JWT.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class LoginController {

    @Autowired
    private StuUserService stuUserService;
    @ResponseBody
    @PostMapping("/login")
    public Result login(StuUser user){
        log.info("登录：",user);
        StuUser u = stuUserService.login(user);

        /*登录成功下发令牌*/
        if(u != null){
            Map<String, Object> claims = new HashMap<>();
            claims.put("username", user.getName());
            //这里填入你想保存的数据
            claims.put("username", user.getPassword());
            log.info(claims.toString());
            String jwt = JWTUtils.generateJwt(claims);
            log.info(jwt);
            return new Result(200,"成功",jwt);
        }

        return Result.error(AppHttpCodeEnum.ERROR);
    }
}
