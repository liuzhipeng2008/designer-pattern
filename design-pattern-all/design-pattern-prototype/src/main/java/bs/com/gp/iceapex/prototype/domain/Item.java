package bs.com.gp.iceapex.prototype.domain;

import java.io.Serializable;

public class Item implements Serializable {

    private String fid ;//主键

    private String frgnCode;//区划编码

    private String fitemIdCode;//项目识别码

    private String fitemCode;//项目编码

    private String fitemName;//项目名称

    private String fsortCode;//项目用途

    private String feffDate;//生效日期

    private String fexpDate;//失效日期

    private String fpIdCode;//父级识别码

    private Integer fisLeaf;//是否低级

    private String fsubId;//科目Id

    private String ffundsNatureCode;//资金性质编码

    private String falterCode;//变更类型

    private Long fversion;//版本号

    private String fcreateTime;//创建时间

    private String fopeDate;//经办日期

    private String foperator;//经办人

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getFrgnCode() {
        return frgnCode;
    }

    public void setFrgnCode(String frgnCode) {
        this.frgnCode = frgnCode;
    }

    public String getFitemIdCode() {
        return fitemIdCode;
    }

    public void setFitemIdCode(String fitemIdCode) {
        this.fitemIdCode = fitemIdCode;
    }

    public String getFitemCode() {
        return fitemCode;
    }

    public void setFitemCode(String fitemCode) {
        this.fitemCode = fitemCode;
    }

    public String getFitemName() {
        return fitemName;
    }

    public void setFitemName(String fitemName) {
        this.fitemName = fitemName;
    }

    public String getFsortCode() {
        return fsortCode;
    }

    public void setFsortCode(String fsortCode) {
        this.fsortCode = fsortCode;
    }

    public String getFeffDate() {
        return feffDate;
    }

    public void setFeffDate(String feffDate) {
        this.feffDate = feffDate;
    }

    public String getFexpDate() {
        return fexpDate;
    }

    public void setFexpDate(String fexpDate) {
        this.fexpDate = fexpDate;
    }

    public String getFpIdCode() {
        return fpIdCode;
    }

    public void setFpIdCode(String fpIdCode) {
        this.fpIdCode = fpIdCode;
    }

    public Integer getFisLeaf() {
        return fisLeaf;
    }

    public void setFisLeaf(Integer fisLeaf) {
        this.fisLeaf = fisLeaf;
    }

    public String getFsubId() {
        return fsubId;
    }

    public void setFsubId(String fsubId) {
        this.fsubId = fsubId;
    }

    public String getFfundsNatureCode() {
        return ffundsNatureCode;
    }

    public void setFfundsNatureCode(String ffundsNatureCode) {
        this.ffundsNatureCode = ffundsNatureCode;
    }

    public String getFalterCode() {
        return falterCode;
    }

    public void setFalterCode(String falterCode) {
        this.falterCode = falterCode;
    }

    public Long getFversion() {
        return fversion;
    }

    public void setFversion(Long fversion) {
        this.fversion = fversion;
    }

    public String getFcreateTime() {
        return fcreateTime;
    }

    public void setFcreateTime(String fcreateTime) {
        this.fcreateTime = fcreateTime;
    }

    public String getFopeDate() {
        return fopeDate;
    }

    public void setFopeDate(String fopeDate) {
        this.fopeDate = fopeDate;
    }

    public String getFoperator() {
        return foperator;
    }

    public void setFoperator(String foperator) {
        this.foperator = foperator;
    }

    @Override
    public String toString() {
        return "Item{" +
                "fid='" + fid + '\'' +
                ", frgnCode='" + frgnCode + '\'' +
                ", fitemIdCode='" + fitemIdCode + '\'' +
                ", fitemCode='" + fitemCode + '\'' +
                ", fitemName='" + fitemName + '\'' +
                ", fsortCode='" + fsortCode + '\'' +
                ", feffDate='" + feffDate + '\'' +
                ", fexpDate='" + fexpDate + '\'' +
                ", fpIdCode='" + fpIdCode + '\'' +
                ", fisLeaf=" + fisLeaf +
                ", fsubId='" + fsubId + '\'' +
                ", ffundsNatureCode='" + ffundsNatureCode + '\'' +
                ", falterCode='" + falterCode + '\'' +
                ", fversion=" + fversion +
                ", fcreateTime='" + fcreateTime + '\'' +
                ", fopeDate='" + fopeDate + '\'' +
                ", foperator='" + foperator + '\'' +
                '}';
    }
}