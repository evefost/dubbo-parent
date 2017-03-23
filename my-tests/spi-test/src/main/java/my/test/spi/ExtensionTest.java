package my.test.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class ExtensionTest {

    public static void main(String[] args){
       ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(MyFirstExtension.class);
        MyFirstExtension myFirstExtension = (MyFirstExtension) extensionLoader.getAdaptiveExtension();
        System.out.println(myFirstExtension.sayHello("bieber", MyFirstExtension.ExtensionType.DEFAULT));
    }
}