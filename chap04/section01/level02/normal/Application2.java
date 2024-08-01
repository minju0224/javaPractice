package com.hanwhaswcamp.chap04.section01.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("키를 입력하세요");
        double m = sc.nextInt();
        System.out.println("몸무게를 입력하세요");
        double kg = sc.nextInt();
        double bmi = kg/(m*m);
        if(bmi >= 30){
            System.out.println("당신은 비만 입니다.");
        }else if(bmi >= 25){
            System.out.println("당신은 과체중 입니다.");
        }else if(bmi >= 20){
            System.out.println("당신은 정상체중 입니다.");
        }else{
            System.out.println("당신은 저체중 입니다.");
        }

    }
}
