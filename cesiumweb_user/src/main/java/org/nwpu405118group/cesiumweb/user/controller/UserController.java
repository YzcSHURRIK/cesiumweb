package org.nwpu405118group.cesiumweb.user.controller;


import org.nwpu405118group.cesiumweb.service.entity.LandMark;
import org.nwpu405118group.cesiumweb.service.entity.User;
import org.nwpu405118group.cesiumweb.service.service.LandMarkService;
import org.nwpu405118group.cesiumweb.service.service.UserService;
import org.nwpu405118group.cesiumweb.service.utils.JwtUtil;
import org.nwpu405118group.cesiumweb.service.utils.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    private LandMarkService landMarkService;
    @Autowired
    private UserService userService;
    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/landmark")
    public Result landmark() {
        List<LandMark> landMarks = landMarkService.findAll();
        return new Result(true, 100, "查询成功", landMarks);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result login(@RequestBody User user) {
        System.out.println(user);
        System.out.println("访问:" + user.toString());
        user = userService.login(user.getEmail(), user.getPassword());
        if (user == null) {
            return new Result(false, 101, "登录失败,用户名或者密码错误");
        }
        String token = jwtUtil.createJWT(user.getId(), user.getEmail(), "user");
        Map map = new HashMap();
        map.put("token", token);
        map.put("email", user.getEmail());
        map.put("nickname", user.getNickname());//昵称
        map.put("avatar", user.getImage());//头像
        return new Result(true, 100, "登录成功", map);
    }
}
