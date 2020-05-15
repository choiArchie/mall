package com.ex.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1:整合Mybatis-plus
 * 1)：导入依赖
 * <dependency>
 * <groupId>com.baomidou</groupId>
 * <artifactId>mybatis-plus</artifactId>
 * <version>3.3.1</version>
 * </dependency>
 * 2):配置
 * 1：配置数据源
 * 1):数据库驱动
 * 2):在Application.yml配置相关信息
 * 2：配置mybatis-plus相关的信息
 * 1):使用MapperScan
 * 2):告诉mybatis-plus、sql映射文件在什么地方
 */
@MapperScan("com.ex.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
