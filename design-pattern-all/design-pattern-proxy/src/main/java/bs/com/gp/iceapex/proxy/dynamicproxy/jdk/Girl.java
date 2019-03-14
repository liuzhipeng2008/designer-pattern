package bs.com.gp.iceapex.proxy.dynamicproxy.jdk;

import bs.com.gp.iceapex.proxy.dynamicproxy.Person;

public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
    }
}