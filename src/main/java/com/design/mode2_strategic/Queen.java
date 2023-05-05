package com.design.mode2_strategic;

import com.design.mode2_strategic.behavior.impl.SwordBehavior;

/**
 * @author sgp
 * @date 2023-05-05
 */
public class Queen extends Character{

    public Queen(){
        this.weaponBehavior = new SwordBehavior();
    }

    public void fight() {
        System.out.println("用尚方宝剑打人");
    }
}
