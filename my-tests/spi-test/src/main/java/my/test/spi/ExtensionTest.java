package my.test.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.container.Container;
import com.alibaba.dubbo.container.Main;
import com.alibaba.dubbo.rpc.Protocol;


public class ExtensionTest {

    public static void main(String[] args) {
//        customerTest();
//        testProtocol()
        container();;
    }
    public static void customerTest() {
        ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(MyFirstExtension.class);
        MyFirstExtension myFirstExtension = (MyFirstExtension) extensionLoader.getAdaptiveExtension();
        System.out.println(myFirstExtension.sayHello(new URL("dubbo", "127.0.0.1", 12345), "bieber", MyFirstExtension.ExtensionType.DEFAULT));
    }

    private static  void testProtocol(){
        ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);
        //动态生成adaptive
        Protocol adaptiveExtension = (Protocol) extensionLoader.getAdaptiveExtension();
        System.out.println(adaptiveExtension);

    }

    private static  void container(){
        Main.main(null);
        ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(Container.class);
        //动态生成adaptive,container 方法没有Adaptivie 注解，不会生成，也就是
//        Container adaptiveExtension = (Container) extensionLoader.getAdaptiveExtension();
//        System.out.println(adaptiveExtension);
        String defaultExtensionName = extensionLoader.getDefaultExtensionName();
        Container defaultExtension = (Container) extensionLoader.getExtension("spring");
        System.out.println(defaultExtension);

    }
}