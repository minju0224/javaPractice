package com.hanwhaswcamp.chap03.level01.basic;

import javax.swing.plaf.PanelUI;

public class Calculator {
    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }
    public int sumto10() {
        int sum = 0;
        for(int i =1;i<=10;i++){
            sum += i;
        }
        return sum;
    }
    public void checkMaxNumber(int a, int b) {
        System.out.println("두 수 중 큰 수는 "+Math.max(a, b)+"이다.");
    }
    public int sumTwoNumbers(int a, int b) {
        return a+b;
    }
    public int minusTwoNumbers(int a, int b) {
        return a-b;
    }
}
