package com.lonel.patterns.proxy;

/**
 * Created by lonel on 2015/12/22.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
