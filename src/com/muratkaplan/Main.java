package com.muratkaplan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    MemberAccount member1=new MemberAccount();
    member1.setAd("Murat");
    member1.setSoyAd("Kaplan");
    member1.setBalance(78);
    member1.setCode(788);
    member1.setId("1254789");
    member1.setPhoneNumber("05444993301");
        MemberAccount member2=new MemberAccount();
        member2.setAd("john");
        member2.setSoyAd("William");
        member2.setBalance(41);
        member2.setCode(456);
        member2.setId("58621477");
        member2.setPhoneNumber("+4444444");
        //System.out.println(member1.getMemberCode());
        //MemberAccountService memberAccount=new MemberAccountService();
        //memberAccount.create(member1);
        //memberAccount.read(member1);
        //memberAccount.update(member1);
        //memberAccount.delete(member1);
        Scanner scanner=new Scanner(System.in);
        System.out.println("fatura tipi seciniz\n1-Telefon\n2-internet\n3-su faturasi\n");
        System.out.print("seciminiz:");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                Fatura fatura=new Fatura("telefon");
                fatura.setCode();
                fatura.islem();
                break;
            case 2:
                Fatura fatura1=new Fatura("internet");
                fatura1.islem();
                break;
            case 3:
                Fatura fatura2=new Fatura("su faturasi");
                fatura2.islem();
                break;
        }
    }


}
