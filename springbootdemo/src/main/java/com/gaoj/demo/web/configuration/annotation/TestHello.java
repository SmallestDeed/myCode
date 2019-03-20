package com.gaoj.demo.web.configuration.annotation;

import com.gaoj.demo.config.configuration.annotation.HelloConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: TestHello
 * @Auther: gaoj
 * @Date: 2019/1/31 18:06
 * @Description:
 * @Version 1.0
 */
public class TestHello {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);

        GetFunctionController getFunctionController = context.getBean(GetFunctionController.class);

        String world = getFunctionController.sayHello("world");

        System.out.println(world);

    }
}
