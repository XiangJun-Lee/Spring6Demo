package com.example.spring6demo.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leelixiangjun
 * @date 2023/5/15 23:33
 */
@Component
public class UserService implements InitializingBean {

    @Autowired
    private OrderService  orderService;

    private Map<String, User> vipUserInfo = new HashMap<>();

    public void test(){
        System.out.println(orderService);
        System.out.println(vipUserInfo);
    }

    /**
     *  初始化方法后执行
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        vipUserInfo.put("001",new User(1,"001"));
        vipUserInfo.put("002",new User(2,"002"));
        vipUserInfo.put("003",new User(3,"003"));
    }
}
