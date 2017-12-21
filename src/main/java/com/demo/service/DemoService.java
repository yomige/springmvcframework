package com.demo.service;

import com.demo.entity.User;

import java.util.List;

/**
 * Created by fraser.yu on 8/31/2016.
 */
public interface DemoService {

    int insertSelective(User record);

    List<User> selectAllUser();
}
