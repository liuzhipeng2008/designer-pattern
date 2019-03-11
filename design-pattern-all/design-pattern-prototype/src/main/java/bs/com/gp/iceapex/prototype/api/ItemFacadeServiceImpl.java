package bs.com.gp.iceapex.prototype.api;

import bs.com.gp.iceapex.prototype.domain.Item;
import bs.com.gp.iceapex.prototype.dto.ItemDTO;
import bs.com.gp.iceapex.prototype.service.IItemService;
import bs.com.gp.iceapex.prototype.utils.CvtDto2domain;

public class ItemFacadeServiceImpl implements IItemFacadeService{
    private IItemService itemService;

    public void setItemService(IItemService itemService) {
        this.itemService = itemService;
    }

    public void saveItem(ItemDTO dto) {
        Item item = CvtDto2domain.cvtItemDTO2Item(dto);
        itemService.doSaveItem(item);
    }
}