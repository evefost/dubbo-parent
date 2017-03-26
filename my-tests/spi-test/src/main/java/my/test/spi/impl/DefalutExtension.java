package my.test.spi.impl;

import com.alibaba.dubbo.common.Node;
import com.alibaba.dubbo.common.URL;
import my.test.spi.MyFirstExtension;

/**
 * Created by qinmp on 2017/3/22.
 */
public class DefalutExtension implements MyFirstExtension ,Node  {
    public String sayHello(URL url,String name, ExtensionType type) {
        return "default extension say hello";
    }

    public URL getUrl() {
        return null;
    }

    public boolean isAvailable() {
        return false;
    }

    public void destroy() {

    }
}
