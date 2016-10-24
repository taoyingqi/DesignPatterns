package com.lonel.patterns.adapter.ifa;

/**
 * Created by lonel on 2015/12/22.
 */
public class SourceSub2 extends Adapter {
    @Override
    public void method2() {
        super.method2();
        System.out.println("the sourceable interface's second Sub2!");
    }
}
