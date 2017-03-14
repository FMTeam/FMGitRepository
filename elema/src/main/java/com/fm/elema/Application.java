package com.fm.elema;

import org.springframework.boot.SpringApplication;

import com.fm.elema.boot.config.ElemaBootConfig;

/**
 * 应用启动类
 *
 */
public class Application {
    public static void main( String[] args ){
        SpringApplication.run(ElemaBootConfig.class, args);
    }
}
