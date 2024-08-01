package com.hanwhaswcamp.chap04.section02.level03.hard;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String str = in.nextLine();
        char word =0;
        boolean check = true;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch >= 'A' && ch <= 'Z')&&!(ch >= 'a' && ch <= 'z')) {
                System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
                check = false;
            }
        }
        if(check == true){
            System.out.println("문자 입력 : ");
            word = in.next().charAt(0);
            for (int i = 0; i < str.length(); i++) {
                if (word == str.charAt(i)) {
                    count++;
                }
            }
            System.out.println("포함된 갯수 :"+count);
        }
    }
}
