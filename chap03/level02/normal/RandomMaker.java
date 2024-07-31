package com.hanwhaswcamp.chap03.level02.normal;

import java.util.Random;

public class RandomMaker {

    public int randomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public String randomUpperAlpabet(int length){
        Random random = new Random();
        String str ="";
        for(int i = 0; i < length; i++){
            str +=(char)(random.nextInt(26) +65);
        }
        return str;
    }

    public String rockPaperScissors(){
        Random random = new Random();
        int random1 = random.nextInt(3)+1;
        if(random1==1){
            return "가위";
        }else if(random1==2){
            return "바위";
        }else{
            return "보";
        }
    }

    public String tossCoin(){
        Random random = new Random();
        int random2 = random.nextInt(2)+1;
        String a ;
        if(random2==1){
             a ="앞면";
        }else{
            a ="뒷면";
        }
        return a;
    }

}
