package com.weichuang.pinduoduo.contorller;

import com.alibaba.fastjson.JSONObject;
import com.weichuang.pinduoduo.annotation.UserLoginToken;
import com.weichuang.pinduoduo.entity.User;
import com.weichuang.pinduoduo.service.TokenService;
import com.weichuang.pinduoduo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("api")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    TokenService tokenService;

    //登录
    @RequestMapping("/login")
    @ResponseBody
    public Object login(@RequestBody User user){
        JSONObject jsonObject=new JSONObject();
        User userForBase=userService.login(user.getUsername() , user.getPassword());
        if(userForBase==null){
            jsonObject.put("message","登录失败,用户不存在");
            return jsonObject;
        }else {
            if (!userForBase.getPassword().equals(user.getPassword())){
                jsonObject.put("message","登录失败,密码错误");
                return jsonObject;
            }else {
                String token = tokenService.getToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);
                System.out.println("jsonObject = " + jsonObject.toString());
                return jsonObject;
            }
        }
    }
    @UserLoginToken
    @RequestMapping("/getMessage")
    @ResponseBody
    public String getMessage(){
        return "你已通过验证";
    }
}
