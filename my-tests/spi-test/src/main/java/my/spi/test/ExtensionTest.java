package my.spi.test;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

import java.util.Set;

public class ExtensionTest {

    public static void main(String[] args){
       ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(MyFirstExtension.class);
        Set loadedExtensions = extensionLoader.getLoadedExtensions();
        // MyFirstExtension myFirstExtension = (MyFirstExtension) extensionLoader.getAdaptiveExtension();
      // System.out.println(myFirstExtension.sayHello("bieber",ExtensionType.DEFAULT));
        System.out.println("");
    }
}