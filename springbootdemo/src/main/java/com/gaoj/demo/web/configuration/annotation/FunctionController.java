package com.gaoj.demo.web.configuration.annotation;

import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: FunctionController
 * @Auther: gaoj
 * @Date: 2019/1/31 17:38
 * @Description:
 * @Version 1.0
 */
@RestController
public class FunctionController {

    public String sayHello(String word) {
        return "Hello " + word;
    }

}
