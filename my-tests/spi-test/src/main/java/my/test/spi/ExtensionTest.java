package my.test.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class ExtensionTest {

    public static void main(String[] args){
       ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(MyFirstExtension.class);
        MyFirstExtension myFirstExtension = (MyFirstExtension) extensionLoader.getAdaptiveExtension();
        System.out.println(myFirstExtension.sayHello(new URL("dubbo","127.0.0.1",12345),"bieber", MyFirstExtension.ExtensionType.DEFAULT));
    }
}