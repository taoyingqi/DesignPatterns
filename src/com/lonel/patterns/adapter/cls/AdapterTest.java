package com.lonel.patterns.adapter.cls;

/**
 * Created by lonel on 2015/12/22.
 */
public class AdapterTest {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
