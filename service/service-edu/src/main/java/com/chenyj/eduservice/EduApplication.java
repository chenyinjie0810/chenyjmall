package com.chenyj.eduservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2020/6/13 0013
 * 陈银杰专属测试
 */
@SpringBootApplication
@ComponentScan(basePackages="com.chenyj")
public class EduApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class, args);
    }
}
