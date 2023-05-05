package com.design.mode1_strategic;

import com.design.mode1_strategic.behavior.FlyBehavior;
import com.design.mode1_strategic.behavior.QuackBehavior;

/**
 * @author sgp
 * @date 2023-05-04
 */
public abstract class Duck {

    /**
     * 将两个变化的行为抽取出来当做一个接口，然后将两个行为组合进来
     */
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * 所有鸭子都会有dispaly的方法，将其抽象成一个抽象方法
     */
    public abstract void dispaly();

    /**
     * 鸭子叫的方法，不同的鸭子叫的方式不一样
     */
    public void quack(){
        quackBehavior.quack();
    }

    /**
     * 鸭子飞的方式
     */
    public void fly(){
        flyBehavior.fly();
    }

    /**
     * 所有的鸭子都会游泳并且游泳的方式都一样的话，将此方法在抽象类中进行实现
     */
    public void swim(){
        System.out.println("所有的鸭子都会飞行");
    }
}
