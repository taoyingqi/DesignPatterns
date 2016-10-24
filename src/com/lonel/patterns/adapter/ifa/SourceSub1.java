package com.lonel.patterns.adapter.ifa;

/**
 * Created by lonel on 2015/12/22.
 */
public class SourceSub1 extends Adapter {

    @Override
    public void method1() {
        super.method1();
        System.out.println("the sourceable interface's first Sub1!");
    }
}
