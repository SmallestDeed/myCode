package com.gaoj.demo.designpatten.decoratorpatten.coffee;

/**
 * @ClassName: Sugger
 * @Auther: gaoj
 * @Date: 2019/3/14 14:12
 * @Description:
 * @Version 1.0
 */
public class Sugger extends Condiment {
    private Coffee coffee;

    public Sugger(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getSeasoning() {
        return coffee.getSeasoning() + ",加糖";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 0.3;
    }
}
