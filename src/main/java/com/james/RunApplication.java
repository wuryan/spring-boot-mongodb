package com.james;

import org.springframework.boot.SpringApplication;

/**
 * @author James Chow
 * @createdate 2015/5/5
 * @contact zhouxy.vortex@gmail.com
 * @since v1.0
 */
public class RunApplication {

    public static void main(String[] args) {
        new SpringApplication(ConfigurationApplication.class).run(args);
    }
}
