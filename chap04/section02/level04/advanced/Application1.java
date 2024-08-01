package com.hanwhaswcamp.chap04.section02.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        System.out.println("숫자를 입력하세요 : ");
        int num = sc.nextInt();
        String [] str1 = str.split(" ");
        num = num%26;
        for (int i = 0; i < str1.length; i++) {
            char ch = str1[i].charAt(0);
            if(ch >= 'a' && ch <= 'z'){
                ch=(char)('a'+(ch + num-'a')%26);
                System.out.print(ch+" ");
            }else if(ch >= 'A' && ch <= 'Z'){
                ch=(char)('A'+(ch + num-'A')%26);
                System.out.print(ch+" ");
            }
        }

    }
}
