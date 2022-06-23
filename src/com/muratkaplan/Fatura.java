package com.muratkaplan;

import java.util.Date;
import java.util.Scanner;

public class Fatura {
    private int amount;
    private Date processDate;
    private String billType;
    private String code;

    public Fatura(String billType) {

        this.billType = billType;
    }

    public void setCode(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Member Code giriniz:");
        String memberCode=scanner.nextLine();
        this.code=memberCode;
    }
    public static void islem(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("fatura tipi seciniz\n1-odeme\n2-sorgulama\n3-odeme iptal\n");
        System.out.print("seciminiz:");
        int choiceMethod=scanner.nextInt();
        faturaService transaction=new faturaService();
        switch (choiceMethod){
            case 1:
                transaction.odeme();
                break;
            case 2:

                transaction.sorgulama();
                break;
            case 3:
                transaction.odemeIptal();
                break;
        }
    }
    public int getAmount() {
        return amount;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public String getBillType() {
        return billType;
    }

    public String getCode() {
        return code;
    }
}
