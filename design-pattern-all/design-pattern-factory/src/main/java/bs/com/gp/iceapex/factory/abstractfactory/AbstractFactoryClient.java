package bs.com.gp.iceapex.factory.abstractfactory;

public class AbstractFactoryClient {
    public static void main(String[] args) {

        IFactory appleFactory = new AppleFactory();
        appleFactory.getComputer().calc();
        appleFactory.getPhone().tell();
        IFactory lenovoFactory = new LenovoFactory();
        lenovoFactory.getComputer().calc();
        lenovoFactory.getPhone().tell();
    }
}