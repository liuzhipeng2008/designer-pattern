package bs.com.gp.iceapex.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    private static Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();

    private ContainerSingleton(){

    }

    public static Object getInstance(String className){
        synchronized (ioc){
            if(ioc.containsKey(className)){
                return ioc.get(className);
            }else{
                Object obj = null;
                try{

                    obj = Class.forName(className).newInstance();
                    ioc.put(className,obj);
                } catch (Exception e){
                    e.printStackTrace();
                }
                return obj;
            }
        }
    }

}