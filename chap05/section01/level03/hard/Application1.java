package com.hanwhaswcamp.chap05.section01.level03.hard;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("홀수인 양의 정수를 입력하세요 :");
        int num = sc.nextInt();
        int[] nums = new int[num];
        if(num % 2 == 0 && num>0) {
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");
        }else{
            for(int i =0;i<=(int)num/2;i++){
                nums[i] = i+1;
                nums[num-i-1] = i+1;
            }
            for(int j=0;j<num;j++){
                System.out.print(nums[j]+" ");
            }
        }
    }
}
