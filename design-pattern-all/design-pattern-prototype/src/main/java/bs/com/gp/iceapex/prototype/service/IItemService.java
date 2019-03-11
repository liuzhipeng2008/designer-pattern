package bs.com.gp.iceapex.prototype.service;

import bs.com.gp.iceapex.prototype.domain.Item;

public interface IItemService {
    /**
     * 保存项目信息
     * @param param
     */
    void doSaveItem(Item param);
}
