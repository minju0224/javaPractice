package com.hanwhaswcamp.chap04.section01.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 하나 입력하세요 : ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("짝수다.");
        }else{
            System.out.println("홀수다.");
        }
    }
}
