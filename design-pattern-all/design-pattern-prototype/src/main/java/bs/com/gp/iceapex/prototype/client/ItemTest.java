package bs.com.gp.iceapex.prototype.client;

import bs.com.gp.iceapex.prototype.api.IItemFacadeService;
import bs.com.gp.iceapex.prototype.api.ItemFacadeServiceImpl;
import bs.com.gp.iceapex.prototype.dto.ItemDTO;
import bs.com.gp.iceapex.prototype.service.ItemServiceImpl;

import java.util.UUID;

public class ItemTest {
    public static void main(String[] args) {
        ItemDTO dto = new ItemDTO();
        dto.setId(UUID.randomUUID().toString());
        dto.setRgnCode("000000");
        dto.setItemCode("101001");
        dto.setItemName("行政事业性收费");
        dto.setItemIdCode(UUID.randomUUID().toString());
        dto.setSortCode("1");
        dto.setEffDate("2019-01-01");
        dto.setExpDate("2019-12-31");
        IItemFacadeService facade = new ItemFacadeServiceImpl();
        ((ItemFacadeServiceImpl) facade).setItemService(new ItemServiceImpl());
        facade.saveItem(dto);
    }
}