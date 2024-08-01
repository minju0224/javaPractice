package com.hanwhaswcamp.chap04.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("월 급여 입력 : ");
        int salary = sc.nextInt();
        System.out.println("매출액 입력 : ");
        int sale = sc.nextInt();

        int percent = 0;
        if(sale >= 50000000) {
            percent = 5;
        }else if(sale >= 30000000){
            percent = 3;
        }else if(sale >= 10000000){
            percent = 1;
        }
        System.out.println("======================");
        System.out.println("매출액 : "+sale);
        System.out.println("보너스 : "+percent+"%");
        System.out.println("월 급여 : "+salary);
        System.out.println("보너스 금액 : "+(int)sale*percent/100);
        System.out.println("======================");
        System.out.println("총 급여 : "+(int)(salary+(sale*percent/100)));
    }
}
