package com.demo.service.impl;

import com.demo.dao.UserMapper;
import com.demo.entity.User;
import com.demo.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by fraser.yu on 8/31/2016.
 */
@Service
public class DemoServiceImpl implements DemoService{

    @Resource
    private UserMapper userMapper;

    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    public List<User> selectAllUser() {
        return userMapper.selectUsers();
    }
}
