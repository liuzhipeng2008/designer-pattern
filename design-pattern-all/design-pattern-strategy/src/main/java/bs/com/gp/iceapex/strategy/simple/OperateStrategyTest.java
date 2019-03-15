package bs.com.gp.iceapex.strategy.simple;

public class OperateStrategyTest {
    public static void main(String[] args) {
        OperateStrategy os = new OperateStrategy();
        int result = os.calc("add", 10, 11);
        System.out.println(result);
    }
}