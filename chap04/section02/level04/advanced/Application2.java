package com.hanwhaswcamp.chap04.section02.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("받으신 금액을 입력하세요 : ");
        int money = sc.nextInt();
        System.out.println("상품 가격을 입력하세요 : ");
        int price = sc.nextInt();
        int [] pay = new int[] {50000,10000,5000,1000,500,100,50,10};
        String [] han = new String[]{"장","장","장","장","개","개","개","개"};
        int won = money - price;
        int [] count =new int[pay.length];
        for(int i =0; i<pay.length; i++){
            while(won >= pay[i]){
                won -= pay[i];
                count[i]++;
            }
        }
        for(int i =0; i<pay.length; i++){
            System.out.println(pay[i]+"원권 지폐 "+count[i]+han[i]);
        }
    }
}
