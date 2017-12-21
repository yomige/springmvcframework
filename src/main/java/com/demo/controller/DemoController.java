package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.DemoService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by fraser.yu on 8/20/2016.
 */

@Controller
@RequestMapping(value = "/demo")
public class DemoController {

    protected static final Logger logger = Logger.getLogger(DemoController.class);
    private User user;
    @Resource
    private DemoService demoService;

    @RequestMapping(value = "user/add", method = RequestMethod.GET)
    public ModelAndView addUser(Model model){
        user = new User();
        model.addAttribute("user",user);
        logger.info("jump to add user page");
        return new ModelAndView("demo/addUser");
    }

    @RequestMapping(value = "user/add", method = RequestMethod.POST)
    public ModelAndView addUser(Model model, @Validated User user, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ModelAndView("demo/addUser");
        }
        demoService.insertSelective(user);
        logger.info("insert user to db");
        return new ModelAndView("redirect: /demo/user/userList ");
    }

    @RequestMapping(value = "user/userList", method = RequestMethod.GET)
    public ModelAndView userList(Model model){
        List<User> users = demoService.selectAllUser();
        model.addAttribute("users",users);
        return new ModelAndView("demo/userList");
    }



}
