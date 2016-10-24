package com.lonel.patterns.adapter.ifa;

import com.lonel.patterns.adapter.cls.Adapter;
import com.lonel.patterns.adapter.cls.Targetable;

/**
 * Created by lonel on 2015/12/22.
 */
public class AdapterTest {
    public static void main(String[] args) {
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }
}
