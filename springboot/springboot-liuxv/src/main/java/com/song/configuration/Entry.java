package com.song.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 444 on 2018/5/2.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.song")
public class Entry {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Entry.class,args);
    }
}
