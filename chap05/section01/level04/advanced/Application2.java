package com.hanwhaswcamp.chap05.section01.level04.advanced;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int [] a = new int[4];
        String num = "";
        Random random = new Random();
        int numCount =0;
        while (numCount <4){
            int newNum = random.nextInt(10);
            boolean unique = true;
            // 중복 불가능하게 boolean으로 처리
            for(int i =0; i < a.length; i++){
                if(a[i] == newNum){
                    unique = false;
                    break;
                }
            }
            if(unique){
                a[numCount] = newNum;
                numCount++;
            }
        }


        int S = 0;
        int B = 0;
        int n =10;
        while (n > 0){
            System.out.println(n + "회 남으셨습니다.");
            System.out.print("4자리 숫자를 입력하세요 : ");
            num = sc.next();
            if(num.length() != 4){
                System.out.println("4자리의 정수를 입력해야 합니다.");
                continue;
            }
            boolean check = true;
            for(int i =0; i < num.length(); i++){
                for(int j =0; j < num.length(); j++){
                    if(num.charAt(i) == num.charAt(j)){
                        check = false;
                    }
                }
            }
            if(!check){
                System.out.println("중복된 수 입력 불가능합니다.");
                continue;
            }
            char [] c = num.toCharArray();

            for(int i = 0; i<a.length; i++){
                for(int j = 0; j< c.length; j++){
                    if(a[i] == (c[j] - '0') && i == j){
                        S++;
                        B++;
                    } else if (a[i] == (c[j] - '0')) {
                        B++;
                    }
                }
            }
            if(S ==4 ){
                System.out.println("정답입니다.");
                System.exit(0);
            }else{
                System.out.println("아쉽네요 " + S + "S " + B + "B 입니다.");
                S =0;
                B =0;
            }
            n--;

        }
        if(n ==0){
            System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다. 정답은");
            for(int i =0; i< a.length; i++){
                System.out.print(a[i]);
            }
        }

    }
}
