package bs.com.gp.iceapex.proxy.dynamicproxy.jdk;

import bs.com.gp.iceapex.proxy.dynamicproxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

public class JDKProxyTest {
    public static void main(String[] args) throws Exception {
        Object object = new MeiPo().getInstance(new Girl());
        Method method = object.getClass().getMethod("findLove",null);
        method.invoke(object);

        //$Proxy0
        byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
        FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
        os.write(bytes);
        os.close();
    }
}