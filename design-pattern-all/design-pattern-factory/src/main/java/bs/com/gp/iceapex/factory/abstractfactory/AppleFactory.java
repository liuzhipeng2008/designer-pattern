package bs.com.gp.iceapex.factory.abstractfactory;

import bs.com.gp.iceapex.factory.common.AppleComputer;
import bs.com.gp.iceapex.factory.common.ApplePhone;
import bs.com.gp.iceapex.factory.common.IComputer;
import bs.com.gp.iceapex.factory.common.IPhone;

public class AppleFactory implements IFactory{
    public IComputer getComputer() {
        return new AppleComputer();
    }

    public IPhone getPhone() {
        return new ApplePhone();
    }
}