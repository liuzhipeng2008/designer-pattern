package bs.com.gp.iceapex.prototype.api;

import bs.com.gp.iceapex.prototype.dto.ItemDTO;

public interface IItemFacadeService {
    /**
     * 保存项目信息
     * @param dto
     */
    void saveItem(ItemDTO dto);
}
