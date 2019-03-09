package bs.com.gp.iceapex.factory.factorymethod;

public class FactoryMethodClient {
    public static void main(String[] args) {
        IFactory lenovoFactory = new LenovoComputerFactory();
        lenovoFactory.getComputer().calc();
        IFactory appleFactory = new AppleComputerFactory();
        appleFactory.getComputer().calc();
    }
}