package bs.com.gp.iceapex.strategy.simple;

import java.util.HashMap;
import java.util.Map;

public class OperateStrategy {

    private static Map<String,IOperate> map = new HashMap<>();

    static{
        map.put("add",new AddOperate());
        map.put("plus",new PlusOperate());
    }

    public int calc(String operType,int a,int b){
        IOperate operate = map.get(operType);
        return operate.calc(a,b);
    }

}