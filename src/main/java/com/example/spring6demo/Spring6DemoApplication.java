package com.example.spring6demo;


import com.example.spring6demo.service.MyConfig;
import com.example.spring6demo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Xiangjun_Lee
 */
public class Spring6DemoApplication {
    public static void main(String[] args) {
        // 创建Spring容器
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        // 向容器中注入一个Bean
        annotationConfigApplicationContext.register(MyConfig.class);
        // 启动Spring容器
        annotationConfigApplicationContext.refresh();
        // 获取Bean对象
        UserService userService = annotationConfigApplicationContext.getBean(UserService.class);
        // 使用Bean对象
        userService.test();
    }

}
