package com.hs.factory.psi.entity;

import java.util.Date;

public class Materials {
    private Integer id; // Materials 序號
    private String genericName; // 原物料名稱通用版本，例：礦物油
    private String inciName; // 原物料供應商提供資料, 原物料名稱INCI_NAME，例：mineral oil
    private String chemicalStructure_name; // 原物料化學結構名稱，例：MOSH-MOAH
    private String aliasName; // 原物料別名，例：白油
    private String vendorNumber; // 原物料編號(供應商版本)，例：M105
    private String vendorName; // 原物料名稱(供應商版本)，例：礦油
    private String vendorSuggestedratio_min; // 原物料建議用量(供應商版本)，例：5 或 50
    private String vendorSuggestedratio_min_unit; // 原物料建議用量(供應商版本)，例：% 或 g/公斤
    private Double capacity; // 原物料進貨最小容積
    private String unit; // 原物料單位
    private String type; // 原物料型態
    // 原始庫存區剩餘量(應該用進貨量 減去 表10.1原物料工廠分裝區對應上架日期-批號對應表 Materials_Factory_Inventory_Area的批號量可以求得)
    // 原始庫存區警示量(原始庫存區警示量 < 原始庫存區剩餘量 需要出警示報表)
    private Integer isRegister; // 是否造冊，法定登記)(1：須造冊
    private Integer storageLife; // 保存期限，壽命：天
    private Integer isNonelife; // (永久有效)(1：有效)
    private String spec1; // 其他規格1
    private String spec2; // 其他規格2 
    private String spec3; // 其他規格3
    private String spec4; // 其他規格4
    private String spec5; // 其他規格5
    private Date createTime; // 建檔日期
    private Integer employeeId; // 建檔者
    private Double lastPrice; // 最後一次交易的價格
    private Double maxPrice; // 最高價格
    private Double minPrice; // 最低價格
    private Double avgPrice; // 平均價格

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getInciName() {
        return inciName;
    }

    public void setInciName(String inciName) {
        this.inciName = inciName;
    }

    public String getChemicalStructure_name() {
        return chemicalStructure_name;
    }

    public void setChemicalStructure_name(String chemicalStructure_name) {
        this.chemicalStructure_name = chemicalStructure_name;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getVendorNumber() {
        return vendorNumber;
    }

    public void setVendorNumber(String vendorNumber) {
        this.vendorNumber = vendorNumber;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorSuggestedratio_min() {
        return vendorSuggestedratio_min;
    }

    public void setVendorSuggestedratio_min(String vendorSuggestedratio_min) {
        this.vendorSuggestedratio_min = vendorSuggestedratio_min;
    }

    public String getVendorSuggestedratio_min_unit() {
        return vendorSuggestedratio_min_unit;
    }

    public void setVendorSuggestedratio_min_unit(String vendorSuggestedratio_min_unit) {
        this.vendorSuggestedratio_min_unit = vendorSuggestedratio_min_unit;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getIsRegister() {
        return isRegister;
    }

    public void setIsRegister(Integer isRegister) {
        this.isRegister = isRegister;
    }

    public Integer getStorageLife() {
        return storageLife;
    }

    public void setStorageLife(Integer storageLife) {
        this.storageLife = storageLife;
    }

    public Integer getIsNonelife() {
        return isNonelife;
    }

    public void setIsNonelife(Integer isNonelife) {
        this.isNonelife = isNonelife;
    }

    public String getSpec1() {
        return spec1;
    }

    public void setSpec1(String spec1) {
        this.spec1 = spec1;
    }

    public String getSpec2() {
        return spec2;
    }

    public void setSpec2(String spec2) {
        this.spec2 = spec2;
    }

    public String getSpec3() {
        return spec3;
    }

    public void setSpec3(String spec3) {
        this.spec3 = spec3;
    }

    public String getSpec4() {
        return spec4;
    }

    public void setSpec4(String spec4) {
        this.spec4 = spec4;
    }

    public String getSpec5() {
        return spec5;
    }

    public void setSpec5(String spec5) {
        this.spec5 = spec5;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Double getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(Double lastPrice) {
        this.lastPrice = lastPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
    }

    @Override
    public String toString() {
        return "Materials{" + "id=" + id + ", genericName=" + genericName + ", inciName=" + inciName + ", chemicalStructure_name=" + chemicalStructure_name + ", aliasName=" + aliasName + ", vendorNumber=" + vendorNumber + ", vendorName=" + vendorName + ", vendorSuggestedratio_min=" + vendorSuggestedratio_min + ", vendorSuggestedratio_min_unit=" + vendorSuggestedratio_min_unit + ", capacity=" + capacity + ", unit=" + unit + ", type=" + type + ", isRegister=" + isRegister + ", storageLife=" + storageLife + ", isNonelife=" + isNonelife + ", spec1=" + spec1 + ", spec2=" + spec2 + ", spec3=" + spec3 + ", spec4=" + spec4 + ", spec5=" + spec5 + ", createTime=" + createTime + ", employeeId=" + employeeId + ", lastPrice=" + lastPrice + ", maxPrice=" + maxPrice + ", minPrice=" + minPrice + ", avgPrice=" + avgPrice + '}';
    }
    
    
    
}
