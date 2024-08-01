package com.hanwhaswcamp.chap04.section02.level02.normal;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int a = sc.nextInt();
        for(int i = 1; i <= a; i++) {
            if(i % 2 == 0) {
                System.out.print("박");
            }else{
                System.out.print("수");
            }
        }
    }
}
