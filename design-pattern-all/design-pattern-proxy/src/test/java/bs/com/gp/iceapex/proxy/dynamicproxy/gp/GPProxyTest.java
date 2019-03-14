package bs.com.gp.iceapex.proxy.dynamicproxy.gp;


import bs.com.gp.iceapex.proxy.dynamicproxy.Person;
import bs.com.gp.iceapex.proxy.dynamicproxy.jdk.Girl;

import java.lang.reflect.Method;

public class GPProxyTest {

    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
            Person obj = (Person) new GPMeipo().getInstance(new Girl());
            System.out.println(obj.getClass());
            //obj.findLove();
            Class<?> clazz = obj.getClass();
            Method method = clazz.getMethod("findLove", null);
            method.invoke(obj);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
