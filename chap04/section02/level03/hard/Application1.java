package com.hanwhaswcamp.chap04.section02.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2보다 큰 정수를 하나 입력하세요 : ");
        int num = sc.nextInt();
        int count = 0;
        for(int i = 2; i < num; i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("소수다.");
        }else{
            System.out.println("소수가 아니다.");
        }
    }
}
