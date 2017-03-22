package my.spi.test.impl;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import my.spi.test.ExtensionType;
import my.spi.test.MyFirstExtension;

@Adaptive
public class AdaptiveExtension implements MyFirstExtension {

    public String sayHello(URL url, String name, ExtensionType type) {
        ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(MyFirstExtension.class);
        MyFirstExtension extension= (MyFirstExtension) extensionLoader.getDefaultExtension();
        switch (type){
            case DEFAULT:
                extension= (MyFirstExtension) extensionLoader.getExtension("default");
                break;
            case OTHER:
                extension= (MyFirstExtension) extensionLoader.getExtension("other");
                break;
        }
        return extension.sayHello(url,name,type);
    }
}