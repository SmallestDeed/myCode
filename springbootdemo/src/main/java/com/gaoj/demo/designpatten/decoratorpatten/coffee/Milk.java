package com.gaoj.demo.designpatten.decoratorpatten.coffee;

/**
 * @ClassName: Milk
 * @Auther: gaoj
 * @Date: 2019/3/14 14:08
 * @Description:
 * @Version 1.0
 */
public class Milk extends Condiment {

    private Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getSeasoning() {
        return coffee.getSeasoning() + ",加牛奶";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 0.5;
    }
}
