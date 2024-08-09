package com.hanwhaswcamp.chap12.level01.normal;

import java.io.IOException;

public class Application2 {
    public static void main(String[] args) throws IOException {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer 합계 : " + sum(intArray));

        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("Double 합계 : " + sum(doubleArray));

        String[] strArray = {"A", "B", "C"};
//         System.out.println("String 합계 : " + sum(strArray));  // 컴파일 에러 발생
    }



    public static <T extends Number> T sum(T[] array) {
        double sum = 0;
        try {
            for (int i = 0; i < array.length; i++) {
                sum += array[i].doubleValue();
            }
        } catch (Exception e) {
            System.out.println("숫자를 입력하세요");
        }
        if (array[0] instanceof Integer) {
            return (T) Integer.valueOf((int) sum);
        } else if (array[0] instanceof Double) {
            return (T) Double.valueOf(sum);
        }
        return (T) Double.valueOf(sum);
    }

}

