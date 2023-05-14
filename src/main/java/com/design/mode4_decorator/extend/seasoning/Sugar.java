package com.design.mode4_decorator.extend.seasoning;

import com.design.mode4_decorator.Beverage;

/**
 * @author sgp
 * @date 2023-05-14
 */
public class Sugar extends CondimentDecorator{

    public Sugar(Beverage beverage){
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + 0.5;
    }

    public String getDescription() {
        return beverage.getDescription() + "suger";
    }
}
