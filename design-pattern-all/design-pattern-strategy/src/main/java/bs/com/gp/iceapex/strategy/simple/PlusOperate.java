package bs.com.gp.iceapex.strategy.simple;

public class PlusOperate implements  IOperate{
    @Override
    public int calc(int a, int b) {
        return a*b;
    }
}