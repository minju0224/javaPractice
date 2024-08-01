package com.hanwhaswcamp.chap04.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("국어 점수를 입력하세요 : ");
        int kor = sc.nextInt();
        System.out.println("영어 점수를 입력하세요 : ");
        int eng = sc.nextInt();
        System.out.println("수학 점수를 입력하세요 : ");
        int mat = sc.nextInt();

        String [] subjectName = new String[] {"국어","영어","수학"};
        int [] subject = new int[]{kor,eng,mat};

        double avg = (double) (kor + eng + mat) /3;

        if(avg<60){
            System.out.println("평균 점수 미달로 불합격입니다.");
            for(int i=0;i<subject.length;i++){
                if(subject[i]<40){
                    System.out.println(subjectName[i]+"점수 미달로 불합격입니다.");
                }
            }
        }else{
            int count =0;
            for(int i=0;i<subject.length;i++){
                if(subject[i]<40){
                    count++;
                    System.out.println(subjectName[i]+"점수 미달로 불합격입니다.");
                }
            }
            if(count==0){
                System.out.println("합격입니다!");
            }
        }
    }
}
