package com.stream.order.service.impl;

import com.stream.order.entity.UserEntity;
import com.stream.order.mapper.UserMapper;
import com.stream.order.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserEntity> getAll() {
        return userMapper.getAll();
    }

    @Override
    public UserEntity getOne(Long id) {
        return userMapper.getOne(id);
    }

    @Override
    public void insert(UserEntity user) {
        userMapper.insert(user);
    }

    @Override
    public void update(UserEntity user) {
        userMapper.update(user);
    }

    @Override
    public void delete(Long id) {
        userMapper.delete(id);
    }
}
