package com.hanwhaswcamp.chap04.section02.level03.hard;
import java.util.Random;
import java.util.Scanner;
public class Application2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        int num;
        int count =0;
        do{
            System.out.println("정수를 입력하세요 : ");
            num = sc.nextInt();
            if(num > randomNum) {
                System.out.println("입력하신 정수보다 작습니다.");
            }else{
                System.out.println("입력하신 정수보다 큽니다.");
            }
            count++;
        }while(num!=randomNum);
        System.out.println("정답입니다. "+count+"회 만에 정답을 맞추셨습니다.");
    }
}
