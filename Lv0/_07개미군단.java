package Lv0;

import java.util.Scanner;

public class _07개미군단 {

    /**
     * 장군개미 : 5, 병정개미 : 3 , 일개미 : 1
     * 최소한의 병력으로 구성하기
     *
     * 23 % 5 = 3
     * @param args
     */
    public static void main(String[] args) {

        int hp = 23;
        int a5 = 5;
        int a3 = 3;
        int a1 = 1;

        int answer = 0;
        int count = 0 ;

        while (hp != 0) {
           if(hp >= 5){
               count += hp / 5;
               hp = hp % 5;

           } else if (hp >= 3 && hp < 5) {
               count += hp / 3;
               hp = hp % 3;
           }else{
               count += hp / 1;
               hp = hp % 1;
           }
        }

        System.out.println(count);
    }



}