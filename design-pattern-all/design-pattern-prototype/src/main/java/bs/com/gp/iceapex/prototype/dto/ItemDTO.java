package bs.com.gp.iceapex.prototype.dto;

import java.io.Serializable;

public class ItemDTO implements Serializable {

    private String id ;//主键

    private String rgnCode;//区划编码

    private String itemIdCode;//项目识别码

    private String itemCode;//项目编码

    private String itemName;//项目名称

    private String sortCode;//项目用途

    private String effDate;//生效日期

    private String expDate;//失效日期

    private String pIdCode;//父级识别码

    private Integer isLeaf;//是否低级

    private String subId;//科目Id

    private String fundsNatureCode;//资金性质编码

    private String alterCode;//变更类型

    private Long version;//版本号

    private String createTime;//创建时间

    private String opeDate;//经办日期

    private String operator;//经办人

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRgnCode() {
        return rgnCode;
    }

    public void setRgnCode(String rgnCode) {
        this.rgnCode = rgnCode;
    }

    public String getItemIdCode() {
        return itemIdCode;
    }

    public void setItemIdCode(String itemIdCode) {
        this.itemIdCode = itemIdCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getEffDate() {
        return effDate;
    }

    public void setEffDate(String effDate) {
        this.effDate = effDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getpIdCode() {
        return pIdCode;
    }

    public void setpIdCode(String pIdCode) {
        this.pIdCode = pIdCode;
    }

    public Integer getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getFundsNatureCode() {
        return fundsNatureCode;
    }

    public void setFundsNatureCode(String fundsNatureCode) {
        this.fundsNatureCode = fundsNatureCode;
    }

    public String getAlterCode() {
        return alterCode;
    }

    public void setAlterCode(String alterCode) {
        this.alterCode = alterCode;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getOpeDate() {
        return opeDate;
    }

    public void setOpeDate(String opeDate) {
        this.opeDate = opeDate;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "id='" + id + '\'' +
                ", rgnCode='" + rgnCode + '\'' +
                ", itemIdCode='" + itemIdCode + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", sortCode='" + sortCode + '\'' +
                ", effDate='" + effDate + '\'' +
                ", expDate='" + expDate + '\'' +
                ", pIdCode='" + pIdCode + '\'' +
                ", isLeaf=" + isLeaf +
                ", subId='" + subId + '\'' +
                ", fundsNatureCode='" + fundsNatureCode + '\'' +
                ", alterCode='" + alterCode + '\'' +
                ", version=" + version +
                ", createTime='" + createTime + '\'' +
                ", opeDate='" + opeDate + '\'' +
                ", operator='" + operator + '\'' +
                '}';
    }
}