package my.spi.test;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;



public class ExtensionTest {

    public static void main(String[] args){
       custom();
    }
    public static void custom(){
        ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(MyFirstExtension.class);
        //Set loadedExtensions = extensionLoader.getLoadedExtensions();
        URL url = new URL("dubbo","192.168.1.1",9999);
        MyFirstExtension myFirstExtension = (MyFirstExtension) extensionLoader.getAdaptiveExtension();
        System.out.println(myFirstExtension.sayHello(url,"bieber",ExtensionType.DEFAULT));
        System.out.println("");
    }
    public static void containser(){
//        ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(Container.class);
//        //Set loadedExtensions = extensionLoader.getLoadedExtensions();
//        URL url = new URL("dubbo","192.168.1.1",9999);
//        MyFirstExtension myFirstExtension = (MyFirstExtension) extensionLoader.getAdaptiveExtension();
//        System.out.println(myFirstExtension.sayHello(url,"bieber",ExtensionType.DEFAULT));
//        System.out.println("");
    }
}