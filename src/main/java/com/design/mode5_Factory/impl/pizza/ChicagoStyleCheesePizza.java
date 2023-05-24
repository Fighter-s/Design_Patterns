package com.design.mode5_Factory.impl.pizza;

import com.design.mode5_Factory.Pizza;

/**
 * @author sgp
 * @date 2023-05-24
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(){
        name = "ChicagoStyleCheesePizza";
        dough = "extra thick crust dough";
        sauce = "flum tomato sause";

        toppings.add("shredded mozzarella cheese");
    }
}
