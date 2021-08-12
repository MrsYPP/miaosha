package org.example.controller;

import org.example.core.Result;
import org.example.pojo.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mrs Yang
 * @date 2021/3/31 22:05
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add")
    @ResponseBody
    public Result addUser(User user) {
        boolean result = userService.addUser(user);
        if (!result) {
            return new Result().failure("添加用户失败");
        }
        return new Result().success();
    }


}
