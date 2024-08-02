package com.hanwhaswcamp.chap05.section02.level01.basic;

public class Application1 {
    public static void main(String[] args) {
        int [][] num = new int[3][4];
        int count =1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
