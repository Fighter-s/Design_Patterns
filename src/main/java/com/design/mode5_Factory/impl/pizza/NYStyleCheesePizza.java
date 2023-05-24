package com.design.mode5_Factory.impl.pizza;

import com.design.mode5_Factory.Pizza;

/**
 * @author sgp
 * @date 2023-05-24
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(){
        name = "NY style cheese pizza";
        dough = "marinara sauce";
        sauce = "marinara sauce";

        toppings.add("grated reggiabo cheese");
    }
}
