package com.design.mode1_strategic.behavior.impl;

import com.design.mode1_strategic.behavior.QuackBehavior;

/**
 * @author sgp
 * @date 2023-05-05
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("模型鸭子嘎嘎叫");
    }
}
