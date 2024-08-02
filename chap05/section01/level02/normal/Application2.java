package com.hanwhaswcamp.chap05.section01.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호를 입력하세요 : ");
        String num = sc.nextLine();
        char[] number = num.toCharArray();
        for (int i = 0; i < 8; i++) {
            System.out.print(number[i]);
        }
        System.out.print("******");
    }
}
