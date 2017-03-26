package my.test.spi.impl;

import com.alibaba.dubbo.common.URL;
import my.test.spi.MyFirstExtension;

/**
 * Created by qinmp on 2017/3/22.
 */
public class OtherExtension implements MyFirstExtension{
    public String sayHello(URL url,String name, ExtensionType type) {
        return "other extension say hello!";
    }
}
