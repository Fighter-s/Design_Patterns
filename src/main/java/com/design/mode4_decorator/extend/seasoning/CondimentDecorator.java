package com.design.mode4_decorator.extend.seasoning;

import com.design.mode4_decorator.Beverage;

/**
 * @author sgp
 * @date 2023-05-14
 */
public abstract class CondimentDecorator extends Beverage{

    Beverage beverage;

    public abstract String getDescription();
}
