package com.design.mode5_Factory.impl;

import com.design.mode5_Factory.Pizza;
import com.design.mode5_Factory.PizzaStore;
import com.design.mode5_Factory.impl.pizzaStore.ChicagoStylePizzaStore;

/**
 * @author sgp
 * @date 2023-05-24
 */
public class Test {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChicagoStylePizzaStore();

        Pizza cheese = pizzaStore.orderPizza("cheese");

        System.out.println(cheese);
    }
}
