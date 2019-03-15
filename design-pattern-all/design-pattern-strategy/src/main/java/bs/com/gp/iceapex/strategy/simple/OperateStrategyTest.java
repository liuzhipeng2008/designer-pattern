package bs.com.gp.iceapex.strategy.simple;

import bs.com.gp.iceapex.strategy.simple.Consts.OperatorConsts;

public class OperateStrategyTest {
    public static void main(String[] args) {
        OperateStrategy operateStrategy = new OperateStrategy(OperateFactory.getOperate(OperatorConsts.ADD));
        System.out.println(operateStrategy.calc(1,3));
    }
}