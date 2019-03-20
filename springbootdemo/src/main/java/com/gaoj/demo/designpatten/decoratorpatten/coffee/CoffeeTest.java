package com.gaoj.demo.designpatten.decoratorpatten.coffee;

/**
 * @ClassName: CoffeeTest
 * @Auther: gaoj
 * @Date: 2019/3/14 14:14
 * @Description:
 * @Version 1.0
 */
public class CoffeeTest {

    public static void main(String[] args) {
        Coffee coffee = new Strong();
        System.out.println(coffee.getSeasoning()+",价格：$"+coffee.getPrice());
        coffee = new Milk(coffee);
        System.out.println(coffee.getSeasoning()+",价格：$"+coffee.getPrice());
        coffee = new Milk(coffee);
        System.out.println(coffee.getSeasoning()+",价格：$"+coffee.getPrice());
        coffee = new Sugger(coffee);
        System.out.println(coffee.getSeasoning()+",价格：$"+coffee.getPrice());
        /**
            装饰器模式：动态将功能附加到对象上，
         */
        Coffee coffee2 = new Dark();
        coffee2 = new Milk(coffee2);
        System.out.println(coffee2.getSeasoning()+",价格：$"+coffee2.getPrice());
        coffee2 = new Sugger(coffee2);
        System.out.println(coffee2.getSeasoning()+",价格：$"+coffee2.getPrice());
        coffee2 = new Milk(coffee2);
        System.out.println(coffee2.getSeasoning()+",价格：$"+coffee2.getPrice());
        coffee2 = new Sugger(coffee2);
        System.out.println(coffee2.getSeasoning()+",价格：$"+coffee2.getPrice());


    }
}
