package my.test.spi.impl;

import my.test.spi.MyFirstExtension;

/**
 * Created by qinmp on 2017/3/22.
 */
public class OtherExtension implements MyFirstExtension{
    public String sayHello(String name, ExtensionType type) {
        return "other extension say hello!";
    }
}
