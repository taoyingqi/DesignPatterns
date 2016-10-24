package com.lonel.patterns.adapter.obj;

/**
 * Created by lonel on 2015/12/22.
 */
public class Adapter implements Targetable {

    private Source source;

    public Adapter(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void method1() {
        source.method1();
    }
}
