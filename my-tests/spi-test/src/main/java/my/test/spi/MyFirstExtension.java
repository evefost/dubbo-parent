package my.test.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI("test1")
public interface MyFirstExtension {

    @Adaptive
    public String sayHello(URL url, String name, ExtensionType type);

    public enum  ExtensionType {
        DEFAULT,OTHER;

    }


}