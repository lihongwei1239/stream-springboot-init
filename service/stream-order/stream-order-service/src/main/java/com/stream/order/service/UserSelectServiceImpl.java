package com.stream.order.service;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userSelectService")
public class UserSelectServiceImpl implements IUserSelectService{

    @Autowired
    private IUserService userService;

    @Override
    public String selectAll() throws Exception {
        return JSON.toJSONString(userService.getAll());
    }
}
