package bs.com.gp.iceapex.prototype.utils;

import bs.com.gp.iceapex.prototype.domain.Item;
import bs.com.gp.iceapex.prototype.dto.ItemDTO;

public class CvtDto2domain {

    public static Item cvtItemDTO2Item(ItemDTO dto){
        Item item = new Item();
        item.setFid(dto.getId());
        item.setFrgnCode(dto.getRgnCode());
        item.setFitemIdCode(dto.getItemIdCode());
        item.setFitemCode(dto.getItemCode());
        item.setFitemName(dto.getItemName());
        item.setFsortCode(dto.getSortCode());
        item.setFeffDate(dto.getEffDate());
        item.setFexpDate(dto.getExpDate());
        item.setFpIdCode(dto.getpIdCode());
        item.setFisLeaf(dto.getIsLeaf());
        item.setFsubId(dto.getSubId());
        item.setFfundsNatureCode(dto.getFundsNatureCode());
        item.setFalterCode(dto.getAlterCode());
        item.setFversion(0L);
        item.setFcreateTime(dto.getCreateTime());
        item.setFopeDate(dto.getOpeDate());
        item.setFoperator(dto.getOperator());
        return item;
    }

}