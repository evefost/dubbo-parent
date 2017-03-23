package my.test.spi;

import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI("default")
public interface MyFirstExtension {
    @Adaptive
    public String sayHello(String name,ExtensionType type);

    public enum  ExtensionType {
        DEFAULT,OTHER;

    }


}