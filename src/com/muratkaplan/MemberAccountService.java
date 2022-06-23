package com.muratkaplan;

import java.util.Scanner;

public class MemberAccountService {
    //create/read/update/delete işlemleri yapan bir servis class,
    public void create(MemberAccount memberAccount){
        System.out.println(memberAccount.getMemberCode()+" numaralı müsteri eklendi");
    }
    public void read(MemberAccount memberAccount){
        System.out.println(memberAccount.getAd()+" "+memberAccount.getSoyAd()+" "+memberAccount.getCode()+" "+memberAccount.getPhoneNumber());
    }
    public void update(MemberAccount memberAccount){
        Scanner scanner=new Scanner(System.in);
        System.out.println("adını giriniz:");
        memberAccount.setAd(scanner.nextLine());
        System.out.println("Soyadını giriniz:");
        memberAccount.setSoyAd(scanner.nextLine());
        System.out.println("update successful");
        System.out.println(memberAccount.getAd());
    }
    public void delete(MemberAccount memberAccount){

            System.out.println("silindi");

    }
}
