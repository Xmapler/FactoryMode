package com.xhf.design.iter;

/**
 * 保镖
 * Created by asus on 2016/11/9.
 */
public class Security implements Watcher {
    @Override
    public void update() {
        System.out.println("运输车有行动，保安贴身保护");
    }
}
