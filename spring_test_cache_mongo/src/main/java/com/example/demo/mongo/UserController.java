package com.example.demo.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/save")
    public String save() {
        User u = new User(System.currentTimeMillis(),"xx","123");
        userRepository.save(u);
        System.out.println(u.toString());
        return "success";
    }

    @GetMapping("getUserList")
    public List<User> getUserList(){
        List<User> userInfoList = userRepository.findAll();
        return userInfoList;
    }

}
