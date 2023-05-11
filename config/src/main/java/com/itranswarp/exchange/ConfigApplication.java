package com.itranswarp.exchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Spring config server. This project is only used to serve config files.
 * Spring配置服务器。该项目仅用于提供配置文件
 * <p>
 * NOTE the default port of config server is 8888.
 * 说明config server默认端口为8888
 * <p>
 * 一个ConfigApplication入口，标注@EnableConfigServer
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        SpringApplication.run(ConfigApplication.class, args);
    }
}