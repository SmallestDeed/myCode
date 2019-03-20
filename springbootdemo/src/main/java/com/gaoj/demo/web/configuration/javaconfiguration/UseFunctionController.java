package com.gaoj.demo.web.configuration.javaconfiguration;

/**
 * @ClassName: UseFunctionController
 * @Auther: gaoj
 * @Date: 2019/3/19 20:47
 * @Description:
 * @Version 1.0
 */
public class UseFunctionController {
    private FunctionController functionController;

    public void setFunctionController(FunctionController functionController) {
        this.functionController = functionController;
    }

    public String sayNo(String somebody) {
        return functionController.sayNo(somebody);
    }
}
