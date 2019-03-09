package bs.com.gp.iceapex.factory.factorymethod;

import bs.com.gp.iceapex.factory.common.IComputer;
import bs.com.gp.iceapex.factory.common.LenovoComputer;

public class LenovoComputerFactory implements IFactory{
    public IComputer getComputer() {
        return new LenovoComputer();
    }
}