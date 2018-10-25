package com.ljx.springboot.proxy;

/**
 * @Auther: jasonliu
 * @Date: 2018/10/25 16:50
 * @Description:
 */
public class MaotaiProxy implements SellWine {

    private MaotaiJiu maotaiJiu ;

    public MaotaiProxy(MaotaiJiu maotaiJiu) {
        this.maotaiJiu = maotaiJiu;
    }

    @Override
    public void maijiu() {
        System.out.println("我是茅台酒代理，要开始售卖茅台酒了！");
        maotaiJiu.maijiu();
        System.out.println("我是茅台酒代理，买酒结束");
    }

    @Override
    public void attend() {
        System.out.println("我是茅台酒代理，要加盟卖茅台酒了！");
        maotaiJiu.attend();
        System.out.println("我是茅台酒代理，加盟成功");
    }
}
