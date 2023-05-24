package com.design.mode5_Factory;

/**
 * @author sgp
 * @date 2023-05-22
 */
public abstract class PizzaStore {
    Pizza pizza;
        public Pizza orderPizza(String type){
            pizza = createPizza(type);

            pizza.bake();

            pizza.cut();

            pizza.box();

            return pizza;
        }

        public  abstract Pizza createPizza(String type);
}
