package bs.com.gp.iceapex.factory.simplefactory;

import bs.com.gp.iceapex.factory.common.IComputer;

public class SimpleFactory {

    IComputer getComputer(Class clazz) {

        try {
            return (IComputer) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;


    }
}