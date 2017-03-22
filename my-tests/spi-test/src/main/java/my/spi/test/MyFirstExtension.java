package my.spi.test;


import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI("test")
public interface MyFirstExtension {
    @Adaptive
    String sayHello(URL url, String name, ExtensionType type);
}