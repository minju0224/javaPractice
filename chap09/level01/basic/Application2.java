package com.hanwhaswcamp.chap09.level01.basic;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine().toLowerCase().replace("!","");
//        String result = "";
//        StringBuilder sb = new StringBuilder();
//        String [] word = s.split(" ");
//        for (int i = 0; i < word.length; i++) {
//            label :
//            for (int j = 0; j < word[i].length(); j++) {
//                int count = 1;
//                while(count<=word[i].length()){
//                    if(!((word[i].charAt(j)>='a' && word[i].charAt(j)<='z')||word[i].charAt(j) == ' ')){
//                        break label;
//                    }else{
//                        count++;
//                    }
//                    if(count==word[i].length()){
//                        result += word[i] + " ";
//                        break label;
//                    }
//                }
//
//            }
//        }
//        String [] results = result.split(" ");
//        int [][] re = new int [results.length][2];
//        for(int i = 0; i < results.length; i++){
//            re[i][0] = i;
//            for(int j = i+1; j < results.length; j++){
//                if(results[i].equals(results[j])){
//                    re[i][1]++;
//                }
//            }
//        }
//        for(int i = 0; i < re.length; i++){
//            for(int j = 0; j < re[i].length; j++){
//                if(results[re[i][0]].equals(results[re[j][0]])){
//                    if(re[i][1]>re[j][1]){
//                        System.out.print(results[re[i][0]]  + " ");
//                        System.out.print(re[i][1]+1);
//                    }else{
//                        System.out.print(results[re[i][0]]  + " ");
//                        System.out.print(re[j][1]+1);
//                    }
//                }else{
//                    System.out.print(results[re[i][0]]  + " ");
//                    System.out.print(re[i][1]+1);
//                }
//            }
//            System.out.println();
//        }


                Scanner sc = new Scanner(System.in);

                String s = sc.nextLine().toLowerCase().replace("!", "");

                String[] words = s.split(" ");

                Map<String, Integer> wordCount = new HashMap<>();

                // 각 단어의 빈도수 세기
                for (String word : words) {
                    if (word.matches("[a-z]+")) { // 알파벳 문자만 포함된 단어인지 확인
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }

                // 결과 출력
                int max = 0;

                for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                    System.out.println(entry.getKey() + " " + entry.getValue());
                    max = Math.max(max, entry.getValue());
                }


    }
}
