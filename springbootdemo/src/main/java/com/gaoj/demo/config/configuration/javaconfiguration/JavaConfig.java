package com.gaoj.demo.config.configuration.javaconfiguration;

import com.gaoj.demo.web.configuration.javaconfiguration.FunctionController;
import com.gaoj.demo.web.configuration.javaconfiguration.UseFunctionController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: JavaConfig
 * @Auther: gaoj
 * @Date: 2019/3/19 20:50
 * @Description:
 * @Version 1.0
 */
@Configuration
public class JavaConfig {
    @Bean
    public FunctionController functionController() {
        return new FunctionController();
    }

    @Bean
    public UseFunctionController useFunctionController() {
        UseFunctionController useFunctionController = new UseFunctionController();
        useFunctionController.setFunctionController(functionController());
        return useFunctionController;
    }


}
