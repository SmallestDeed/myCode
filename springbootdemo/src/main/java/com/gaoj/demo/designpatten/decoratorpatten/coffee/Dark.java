package com.gaoj.demo.designpatten.decoratorpatten.coffee;

/**
 * @ClassName: Dark
 * @Auther: gaoj
 * @Date: 2019/3/14 13:59
 * @Description:
 * @Version 1.0
 * <p>
 * 具体装饰
 */
public class Dark implements Coffee {
    @Override
    public String getSeasoning() {
        return "深培咖啡";
    }

    @Override
    public double getPrice() {
        return 2.11;
    }
}
