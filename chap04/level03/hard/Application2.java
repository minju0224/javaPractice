package com.hanwhaswcamp.chap04.level03.hard;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
//        String [] fruits = new String [] {"사과", "바나나", "복숭아","키위"};
//        int [] price = new int []{1000,3000,2000,5000};
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        label:
//        for(int i = 0; i < fruits.length; i++){
//            if(fruits[i].equals(name)){
//                System.out.println(fruits[i]+"의 가격은 "+price[i]+"원 입니다.");
//            }else{
//                System.out.println("준비된 상품이 없습니다.");
//                break label;
//            }
        Scanner sc = new Scanner(System.in);
        System.out.println("과일 이름을 입력하세요 : ");
        String name = sc.nextLine();
        int price = 0;
        switch(name){
            case "사과":
                price = 1000;
                break;
            case "바나나":
                price = 3000;
                break;
            case "복숭아":
                price = 2000;
                break;
            case "키위":
                price = 5000;
                break;
        }
        System.out.println(name+"의 가격은 "+price+"원 입니다.");
    }
}
