package com.design.mode1_strategic.behavior.impl;

import com.design.mode1_strategic.behavior.FlyBehavior;

/**
 * @author sgp
 * @date 2023-05-04
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("可以飞行");
    }
}
