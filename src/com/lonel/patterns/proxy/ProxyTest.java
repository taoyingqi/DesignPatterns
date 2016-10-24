package com.lonel.patterns.proxy;

/**
 * Created by lonel on 2015/12/22.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }
}
