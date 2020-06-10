package com.imooc.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Michael on 2017/10/28.
 */
@SpringBootApplication
public class ServiceApplication {

    public static void main(String args[]) {
        for(String a : args) {
            System.out.println(a);
        }
        SpringApplication.run(ServiceApplication.class, args);
    }
}
