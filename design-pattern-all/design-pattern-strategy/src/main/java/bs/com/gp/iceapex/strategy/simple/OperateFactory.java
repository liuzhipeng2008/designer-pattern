package bs.com.gp.iceapex.strategy.simple;

import bs.com.gp.iceapex.strategy.simple.Consts.OperatorConsts;

import java.util.HashMap;
import java.util.Map;

public class OperateFactory {
    private final static Map<String,IOperate> OPER_MAP = new HashMap<>();

    static{
        OPER_MAP.put(OperatorConsts.ADD,new AddOperate());
        OPER_MAP.put(OperatorConsts.SUBTRACT,new SubtractOperate());
        OPER_MAP.put(OperatorConsts.PLUS,new PlusOperate());
        OPER_MAP.put(OperatorConsts.DIVID,new DividOperate());
    }
    private OperateFactory(){

    }

    public static IOperate getOperate(String key){
        return OPER_MAP.get(key);
    }
}