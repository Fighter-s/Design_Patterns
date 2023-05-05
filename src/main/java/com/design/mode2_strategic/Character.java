package com.design.mode2_strategic;

import com.design.mode2_strategic.behavior.WeaponBehavior;

/**
 * @author sgp
 * @date 2023-05-05
 */
public abstract class Character {

    public WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void useWeapon(){
        weaponBehavior.useWeapon();
    }
}
