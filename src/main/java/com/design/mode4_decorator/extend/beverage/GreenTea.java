package com.design.mode4_decorator.extend.beverage;

import com.design.mode4_decorator.Beverage;

/**
 * @author sgp
 * @date 2023-05-14
 */
public class GreenTea extends Beverage {

    public GreenTea(){
        description = "GreenTea";
    }

    public double cost() {
        return 1.5;
    }
}
