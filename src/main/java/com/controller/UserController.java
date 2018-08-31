package com.controller;

import com.model.UserModel;
import com.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     * @param
     * @return
     * @throws
     * @Description: 跳转登录页面
     * @author yx
     * @date 2018/8/31 9:23
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String toLogin() {
        logger.info("调用 toLogin 接口");
        return "login";
    }

    /**
     * @param
     * @return
     * @throws
     * @Description: 用户登录方法
     * @author yx
     * @date 2018/8/31 9:26
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(UserModel userModel) {
        logger.info("调用 login 接口");
        userService.login();
        return "redirect" +
                ": /retailer/list";
    }

    /**
     * @param
     * @return
     * @throws
     * @Description: 用户注册页面
     * @author yx
     * @date 2018/8/31 9:31
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String toRegister() {
        logger.info("调用 toRegister 接口");
        return "register";
    }

    /**
     * @param
     * @return
     * @throws
     * @Description: 用户注册
     * @author yx
     * @date 2018/8/31 9:31
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(UserModel userModel, Model model) {
        logger.info("调用 register 接口");
        //查询账号是否已经注册
        Map<String, String> map = new HashMap();
        map.put("username", userModel.getUsername());
        List<UserModel> list = userService.find(map);
        return "redirect:/login";
    }


}
