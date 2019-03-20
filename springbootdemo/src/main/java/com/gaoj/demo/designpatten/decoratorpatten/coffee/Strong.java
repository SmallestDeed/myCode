package com.gaoj.demo.designpatten.decoratorpatten.coffee;

/**
 * @ClassName: Strong
 * @Auther: gaoj
 * @Date: 2019/3/14 13:58
 * @Description:
 * @Version 1.0
 * <p>
 * 具体装饰
 */
public class Strong implements Coffee {
    @Override
    public String getSeasoning() {
        return "浓缩咖啡";
    }

    @Override
    public double getPrice() {
        return 1.99;
    }
}
