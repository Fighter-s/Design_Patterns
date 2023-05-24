package com.design.mode5_Factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sgp
 * @date 2023-05-22
 */
public abstract class Pizza {

    public String name;

    public String dough;

    public String sauce;

    public List<String> toppings = new ArrayList<String>();


    void bake(){
        System.out.println("bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("cutting the pizza ihnto diagonal slices");
    }

    void box(){
        System.out.println("place pizza in official pizzaStore box");
    }

    public String getName(){
        return name;
    }
}
