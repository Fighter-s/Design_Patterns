package com.design.mode1_strategic.behavior.impl;

import com.design.mode1_strategic.behavior.QuackBehavior;

/**
 * @author sgp
 * @date 2023-05-04
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("嘎嘎叫");
    }
}
