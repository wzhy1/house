package com.wzhy.house.controller;

import com.wzhy.house.model.User;
import com.wzhy.house.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     *  CrossOrigin 设置跨域
     * @param user
     * @return
     */
    @CrossOrigin
    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> login(@RequestBody User user){
        System.out.println("user="+user.getUsername());
        Map<String,Object> map = new HashMap<>();
        User user1 = userService.getUser(user);
        if(!StringUtils.isEmpty(user1)){
            map.put("code",0);
            map.put("msg","登录成功！");
            map.put("data",user1);
        } else {
            map.put("code",1);
            map.put("msg","登录失败！");
            map.put("data",null);
        }
        //jhshh
        return map;
    }
}
