package com.pipework.usercenter.controller.message;

import com.pipework.api.message.IMessageService;
import org.pipework.framework.core.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * User: lixiang
 * Date: 2015/1/14
 * Time: 14:32
 */
@Controller
@RequestMapping("/message")
public class MessageController extends BaseController {

    @Autowired
    private IMessageService messageService;
    @RequestMapping("/index")
    public ModelAndView index()
    {
        ModelAndView modelAndView=new ModelAndView();

        modelAndView.setViewName("index");
        return modelAndView;

    }


}
