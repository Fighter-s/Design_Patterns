package com.design.mode3_observer;

/**
 * 主题接口
 * @author sgp
 * @date 2023-05-07
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    public void notice();

}
