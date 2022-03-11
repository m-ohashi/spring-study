package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @RequestMapping("/")
    Map index() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        User user = userService.register("hoge");
        Map<String, String> result = new HashMap<>();
        result.put("id", user.getUserId().toString());
        result.put("name", user.getUserName());
        return result;
    }
}
