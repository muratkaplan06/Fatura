package com.muratkaplan;

public class MemberAccount {
    //MemberAccount ad, soyad, id, code, balance , cep telefonu bilgileri içermeli.
    private String ad;
    private String soyAd;
    private String id;
    private int code;
    private int balance;
    private String phoneNumber;
    private String memberCode;


    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMemberCode() {
        memberCode=this.id+this.ad.substring(0,2);
        return memberCode;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public String getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public int getBalance() {
        return balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
