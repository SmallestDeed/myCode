package com.gaoj.demo.web.configuration.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: GetFunctionController
 * @Auther: gaoj
 * @Date: 2019/1/31 17:59
 * @Description:
 * @Version 1.0
 */
@RestController
public class GetFunctionController {

    @Autowired
    private FunctionController functionController;

    public String sayHello(String word) {
        return functionController.sayHello(word);
    }

}
