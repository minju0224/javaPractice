package com.hanwhaswcamp.chap06.level01.basic;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] students = new StudentDTO[10];
        Scanner sc = new Scanner(System.in);

        int num = 0;
        label:
        while (num < 10) {
            System.out.println("학년 :");
            int grade = sc.nextInt();
            System.out.println("반 :");
            int classNum = sc.nextInt();
            System.out.println("이름 :");
            String name = sc.next();
            System.out.println("국어점수 :");
            int kor =  sc.nextInt();
            System.out.println("영어점수 :");
            int eng =  sc.nextInt();
            System.out.println("수학점수 :");
            int math =  sc.nextInt();
            students[num] = new StudentDTO(grade, classNum, name, kor, eng, math);

            System.out.println("계속 추가할 겁니까? (y/n) : ");
            char ch = sc.next().charAt(0);
            if(ch == 'y' || ch == 'Y'){
                num++;
                continue;
            } else if (ch == 'N' || ch == 'n') {
                break label;
            }
        }
        for( int i = 0; i <= num; i++ ) {
            System.out.println(students[i].getInformation());
        }
    }
}
