package com.design.mode5_Factory.impl.pizzaStore;

import com.design.mode5_Factory.Pizza;
import com.design.mode5_Factory.PizzaStore;
import com.design.mode5_Factory.impl.pizza.ChicagoStyleCheesePizza;
import com.design.mode5_Factory.impl.pizza.NYStyleCheesePizza;

/**
 * @author sgp
 * @date 2023-05-22
 */
public class NYStyleCheesePizzaStore extends PizzaStore {


    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
