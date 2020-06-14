package com.chenyj.eduservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2020/6/13 0013
 * 陈银杰专属测试
 */
@Configuration
@MapperScan({"com.chenyj.eduservice.mapper"})
public class MybatisPlusConfig {

//    @Bean
//    public ISqlInjector sqlInjector(){
//        return new LogicSqlInjector();
//    }
}
