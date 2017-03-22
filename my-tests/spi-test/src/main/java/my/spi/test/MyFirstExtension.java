package my.spi.test;


import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI("default")
public interface MyFirstExtension {
    @Adaptive
    String sayHello(String name, ExtensionType type);
}