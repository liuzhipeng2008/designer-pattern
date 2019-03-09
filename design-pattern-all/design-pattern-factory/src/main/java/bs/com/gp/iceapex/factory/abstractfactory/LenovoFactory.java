package bs.com.gp.iceapex.factory.abstractfactory;

import bs.com.gp.iceapex.factory.common.IComputer;
import bs.com.gp.iceapex.factory.common.IPhone;
import bs.com.gp.iceapex.factory.common.LenovoComputer;
import bs.com.gp.iceapex.factory.common.LenovoPhone;

public class LenovoFactory implements IFactory {
    public IComputer getComputer() {
        return new LenovoComputer();
    }

    public IPhone getPhone() {
        return new LenovoPhone();
    }
}