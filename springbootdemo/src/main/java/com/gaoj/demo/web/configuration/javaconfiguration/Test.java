package com.gaoj.demo.web.configuration.javaconfiguration;

import com.gaoj.demo.config.configuration.javaconfiguration.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: Test
 * @Auther: gaoj
 * @Date: 2019/3/19 20:56
 * @Description:
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        UseFunctionController bean = context.getBean(UseFunctionController.class);
        System.out.println(bean.sayNo("jjjjjjj"));

        context.close();
    }
}
