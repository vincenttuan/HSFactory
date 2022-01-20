package com.hs.factory.psi.entity;

import java.util.Date;

public class Materials {
    private Integer id;
    private String genericName;
    private String inciName;
    private String chemicalStructure_name;
    private String aliasName;
    private String vendorNumber;
    private String vendorName;
    private String vendorSuggestedratio_min;
    private String vendorSuggestedratio_min_unit;
    private Double capacity;
    private String unit;
    private String type;
    private Integer isRegister;
    private Integer storageLife;
    private Integer isNonelife;
    private String spec1;
    private String spec2;
    private String spec3;
    private String spec4;
    private String spec5;
    private Date createTime;
    private Integer employeeId;
    private Double lastPrice;
    private Double maxPrice;
    private Double minPrice;
    private Double avgPrice;

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
