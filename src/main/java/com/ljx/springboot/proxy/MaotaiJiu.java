package com.ljx.springboot.proxy;

/**
 * @Auther: jasonliu
 * @Date: 2018/10/25 16:49
 * @Description:
 */
public class MaotaiJiu implements SellWine {

    @Override
    public void maijiu() {
        System.out.println("开始售卖茅台酒！");
    }

    @Override
    public void attend() {
        System.out.println("开始加盟卖茅台酒！");
    }
}
