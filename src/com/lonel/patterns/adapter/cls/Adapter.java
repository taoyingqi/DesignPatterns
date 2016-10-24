package com.lonel.patterns.adapter.cls;

/**
 * Created by lonel on 2015/12/22.
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
