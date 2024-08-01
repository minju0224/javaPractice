package com.hanwhaswcamp.chap04.section02.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++){
            System.out.println(i+" : "+s.charAt(i));
        }
    }
}
