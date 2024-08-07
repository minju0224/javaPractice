package com.hanwhaswcamp.chap09.level01.basic;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력  : ");
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strs.length; i++){
            if(!strs[i].isEmpty()){
                char firstChar = Character.toUpperCase(strs[i].charAt(0));
                String rest = strs[i].substring(1);

                sb.append(firstChar).append(rest).append(" ");
            }
        }
        String result = sb.toString().trim();
        System.out.println(result);
        System.out.println(strs.length);
    }
}
