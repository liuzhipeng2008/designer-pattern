package bs.com.gp.iceapex.prototype.service;

import bs.com.gp.iceapex.prototype.domain.Item;

public class ItemServiceImpl implements IItemService{

    public void doSaveItem(Item param) {
        System.out.println(param);
        System.out.println("执行保存方法");
    }
}