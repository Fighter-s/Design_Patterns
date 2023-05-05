package com.design.mode1_strategic.behavior.impl;

import com.design.mode1_strategic.behavior.QuackBehavior;

/**
 * @author sgp
 * @date 2023-05-04
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("不能叫");
    }
}
