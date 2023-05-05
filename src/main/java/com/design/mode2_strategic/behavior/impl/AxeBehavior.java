package com.design.mode2_strategic.behavior.impl;

import com.design.mode2_strategic.behavior.WeaponBehavior;

/**
 * @author sgp
 * @date 2023-05-05
 */
public class AxeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("实现用斧头劈砍");
    }
}
