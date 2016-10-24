package com.lonel.patterns.proxy;

/**
 * Created by lonel on 2015/12/22.
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        atfer();
    }

    private void before() {
        System.out.println("before proxy!");
    }

    private void atfer() {
        System.out.println("after proxy!");
    }
}
