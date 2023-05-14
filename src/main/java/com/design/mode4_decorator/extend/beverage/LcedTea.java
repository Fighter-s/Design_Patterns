package com.design.mode4_decorator.extend.beverage;

import com.design.mode4_decorator.Beverage;

/**
 * @author sgp
 * @date 2023-05-14
 */
public class LcedTea extends Beverage {

    public LcedTea(){
        description = "LcedTea";
    }

    public double cost() {
        return 2.0;
    }
}
