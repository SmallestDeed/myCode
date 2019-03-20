package com.gaoj.demo.designpatten;

/**
 * @ClassName: Duck
 * @Auther: gaoj
 * @Date: 2019/3/14 10:42
 * @Description:
 * @Version 1.0
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("游泳");
    }

    public abstract void display();

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
