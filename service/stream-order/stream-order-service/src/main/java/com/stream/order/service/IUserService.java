package com.stream.order.service;

import com.stream.order.entity.UserEntity;

import java.util.List;

public interface IUserService {


    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);


    void update(UserEntity user);

    void delete(Long id);
}
