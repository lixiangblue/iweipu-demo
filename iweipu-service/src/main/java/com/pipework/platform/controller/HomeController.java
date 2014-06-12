package com.pipework.platform.controller;

import com.pipework.api.account.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: LiXiang
 * Date: 14-6-12
 * Time: 下午11:02
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HomeController {
    private IAccountService iAccountService;
    @Autowired
    public void setUserDao(@Qualifier("accountApiService") IAccountService iAccountService) {
        this.iAccountService = iAccountService;
    }
    @RequestMapping("/index")
    public ModelAndView index()
    {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("name", iAccountService.sayHello("name"));
        modelAndView.setViewName("index");
        return modelAndView;

    }
}