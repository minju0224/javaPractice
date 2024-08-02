package com.hanwhaswcamp.chap05.section02.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Random random = new Random();
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("가로 행의 수를 입력하세요 : ");
            int w = sc.nextInt();
            System.out.println(" 세로 열의 수를 입력하세요 : ");
            int h = sc.nextInt();
            if(h>0&&h<11&&w>0&&w<11){
                int[][] box = new int[w][h];
                for (int i = 0; i < box.length; i++) {
                    for (int j = 0; j < box[i].length; j++) {
                        box[i][j] = random.nextInt(26) + 65;
                        System.out.print((char)box[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            }else{
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
            }
        }while(true);
    }
}
