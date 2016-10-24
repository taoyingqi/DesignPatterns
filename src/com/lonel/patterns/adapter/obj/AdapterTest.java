package com.lonel.patterns.adapter.obj;

/**
 * Created by lonel on 2015/12/22.
 */
public class AdapterTest {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Adapter(source);
        target.method1();
        target.method2();
    }
}
