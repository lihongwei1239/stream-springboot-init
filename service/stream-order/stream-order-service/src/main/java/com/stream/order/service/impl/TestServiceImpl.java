package com.stream.order.service.impl;

import com.stream.order.service.ITestService;
import org.springframework.stereotype.Service;


@Service("testService")
public class TestServiceImpl implements ITestService {

    @Override
    public String hello(String name) throws Exception {
        return name +" hello!";
    }
}
