package com.hanwhaswcamp.chap04.section01.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 : ");
        int a = sc.nextInt();
        System.out.println("두 번째 정수 : ");
        int b = sc.nextInt();
        System.out.println("연산 기호를 입력하세요 :");
        char c = sc.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
        }
    }
}
