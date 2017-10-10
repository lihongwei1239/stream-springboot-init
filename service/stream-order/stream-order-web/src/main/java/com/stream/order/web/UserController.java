package com.stream.order.web;

import com.stream.order.entity.UserEntity;
import com.stream.order.service.ITestService;
import com.stream.order.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    public IUserService userService;

    @RequestMapping("/selectAll")
    public List<UserEntity> selectAll() throws  Exception{
        return userService.getAll();
    }
}
