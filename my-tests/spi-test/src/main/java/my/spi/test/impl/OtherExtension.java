package my.spi.test.impl;

import my.spi.test.ExtensionType;
import my.spi.test.MyFirstExtension;

/**
 * Created by xieyang on 17/3/22.
 */
public class OtherExtension implements MyFirstExtension{
    @Override
    public String sayHello(String name, ExtensionType type) {
        return "default extension say hello";
    }
}
