package com.design.mode4_decorator.extend;

import com.design.mode4_decorator.Beverage;
import com.design.mode4_decorator.extend.beverage.GreenTea;
import com.design.mode4_decorator.extend.seasoning.Sugar;
import com.design.mode4_decorator.extend.seasoning.Tea;
import com.design.mode4_decorator.extend.seasoning.Water;

/**
 * @author sgp
 * @date 2023-05-14
 */
public class Test {

    public static void main(String[] args) {

        // 创建一个原始的绿茶对象
        Beverage greenTea = new GreenTea();
        // 往绿茶里边再加点茶
        greenTea = new Tea(greenTea);
        // 绿茶里边加点糖
        greenTea = new Sugar(greenTea);
        // 绿茶里边再加点水
        greenTea = new Water(greenTea);

        System.out.println("该茶需要花费的价格是"+greenTea.cost());
        System.out.println("该茶的描述为"+greenTea.getDescription());
    }
}
