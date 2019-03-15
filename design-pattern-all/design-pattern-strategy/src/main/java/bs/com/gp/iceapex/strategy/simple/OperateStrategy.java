package bs.com.gp.iceapex.strategy.simple;

public class OperateStrategy {

    private IOperate operate;

    public OperateStrategy(IOperate operate) {
        this.operate = operate;
    }

    public int calc(int a,int b){
       return this.operate.calc(a,b);
    }

}