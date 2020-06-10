package com.imooc.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Michael on 2017/10/28.
 */
@SpringBootApplication
public class ServiceApplication {

    public static void main(String args[]) {
        System.out.println("args len:"+args.length);
        for(String s : args) {
            System.out.println(s);
        }
        SpringApplication.run(ServiceApplication.class, args);
    }
}
