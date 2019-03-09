package bs.com.gp.iceapex.factory.simplefactory;

import bs.com.gp.iceapex.factory.common.LenovoComputer;

public class SimpleFactoryClient {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        factory.getComputer(LenovoComputer.class).calc();
    }
}