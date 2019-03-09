package bs.com.gp.iceapex.factory.factorymethod;

import bs.com.gp.iceapex.factory.common.AppleComputer;
import bs.com.gp.iceapex.factory.common.IComputer;

public class AppleComputerFactory implements IFactory{
    public IComputer getComputer() {
        return new AppleComputer();
    }
}