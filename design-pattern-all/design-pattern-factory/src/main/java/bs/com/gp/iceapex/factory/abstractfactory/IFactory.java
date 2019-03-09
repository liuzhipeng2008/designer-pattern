package bs.com.gp.iceapex.factory.abstractfactory;

import bs.com.gp.iceapex.factory.common.IComputer;
import bs.com.gp.iceapex.factory.common.IPhone;

public interface IFactory {

    IComputer getComputer();

    IPhone getPhone();
}