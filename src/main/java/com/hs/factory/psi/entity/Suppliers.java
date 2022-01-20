package com.hs.factory.psi.entity;

import java.util.Date;

public class Suppliers {
    private Integer id; // Suppliers 序號
    private String name; // 供應商名稱
    private String masterName; // 負責人姓名
    private String masterCellphone; // 負責人行動電話
    private String tel; // 公司電話
    private String fax; // 公司傳真
    private String email; // 公司電子郵件
    private String web; // 公司網站
    private String line; // 公司LINE
    private String postal; // 郵遞區號
    private String addNation; // 地址:國家
    private String addCounty; // 地址:縣市
    private String addDistrict; // 地址:區域
    private String addRoad; // 地址:街道路名
    private Integer payment; // 支付方式：1.月結、2.簽口(預付)、3.到付
    private Integer receive; // 收款方式：1.轉帳、2.支票，3.現金
    private Double balance; // 簽口餘額，用decimal規範整數位12位，小數點2位
    private Date settlement; // 結算日:15 或 30
    private String checkName; // 支票抬頭
    private String bankNo; // 銀行代號
    private String bankAccount; // 銀行帳戶
    private Double totalExpenditure; // 採購總支出額，轉檔時才將資料計算並寫入此欄位，用decimal規範整數位12位，小數點2位
    private String remark; // 採購備註

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public String getMasterCellphone() {
        return masterCellphone;
    }

    public void setMasterCellphone(String masterCellphone) {
        this.masterCellphone = masterCellphone;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getAddNation() {
        return addNation;
    }

    public void setAddNation(String addNation) {
        this.addNation = addNation;
    }

    public String getAddCounty() {
        return addCounty;
    }

    public void setAddCounty(String addCounty) {
        this.addCounty = addCounty;
    }

    public String getAddDistrict() {
        return addDistrict;
    }

    public void setAddDistrict(String addDistrict) {
        this.addDistrict = addDistrict;
    }

    public String getAddRoad() {
        return addRoad;
    }

    public void setAddRoad(String addRoad) {
        this.addRoad = addRoad;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Integer getReceive() {
        return receive;
    }

    public void setReceive(Integer receive) {
        this.receive = receive;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getSettlement() {
        return settlement;
    }

    public void setSettlement(Date settlement) {
        this.settlement = settlement;
    }

    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Double getTotalExpenditure() {
        return totalExpenditure;
    }

    public void setTotalExpenditure(Double totalExpenditure) {
        this.totalExpenditure = totalExpenditure;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Suppliers{" + "id=" + id + ", name=" + name + ", masterName=" + masterName + ", masterCellphone=" + masterCellphone + ", tel=" + tel + ", fax=" + fax + ", email=" + email + ", web=" + web + ", line=" + line + ", postal=" + postal + ", addNation=" + addNation + ", addCounty=" + addCounty + ", addDistrict=" + addDistrict + ", addRoad=" + addRoad + ", payment=" + payment + ", receive=" + receive + ", balance=" + balance + ", settlement=" + settlement + ", checkName=" + checkName + ", bankNo=" + bankNo + ", bankAccount=" + bankAccount + ", totalExpenditure=" + totalExpenditure + ", remark=" + remark + '}';
    }
    
    
    
}
