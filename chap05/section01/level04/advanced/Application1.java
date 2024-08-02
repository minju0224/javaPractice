package com.hanwhaswcamp.chap05.section01.level04.advanced;
import java.util.Arrays;
import java.util.Random;

public class Application1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] num = new int[6];
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(45)+1;
            for (int j = 0; j < i; j++) {
                if (num[j] == num[i]) {
                    i--;
                    break;
                }
            }
        }
        Arrays.sort(num);
        for (int j : num) {
            System.out.print(j + " ");
        }
    }
}
