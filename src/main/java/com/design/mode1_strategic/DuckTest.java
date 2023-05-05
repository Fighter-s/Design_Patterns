package com.design.mode1_strategic;

import com.design.ModelDuck;
import com.design.mode1_strategic.behavior.impl.FlyNoWays;
import com.design.mode1_strategic.behavior.impl.Squeak;

/**
 * @author sgp
 * @date 2023-05-05
 */
public class DuckTest {
    public static void main(String[] args) {
        // 创建一个模型鸭子  赋予不能飞行为和橡皮鸭子嘎嘎叫行为
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyNoWays());
        modelDuck.setQuackBehavior(new Squeak());
        modelDuck.fly();
        modelDuck.quack();
        modelDuck.dispaly();
        modelDuck.swim();
    }
}
