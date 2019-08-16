package com.example.demo;

import com.example.demo.mongo.User;
import com.example.demo.mongo.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


    @Autowired
    private UserRepository userRepository;

    @Test
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public void save() {
        User u = new User(System.currentTimeMillis(),"xx","123");
        userRepository.save(u);
//        return "success";
    }

}
