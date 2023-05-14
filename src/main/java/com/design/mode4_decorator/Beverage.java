package com.design.mode4_decorator;

/**
 * @author sgp
 * @date 2023-05-14
 */
public abstract class Beverage {

    public String description = "unknown Beverage";

    public abstract double cost();

    public String getDescription(){
        return description;
    }
}
