package com.james;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author James
 * @version 1.0
 * @date 5/3/15 7:33 PM
 * @e-mail zhouxy.vortex@gmail.com
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World !!!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class);
    }
}
