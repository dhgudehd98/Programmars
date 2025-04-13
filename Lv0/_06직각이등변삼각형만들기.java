package Lv0;

import java.util.Scanner;

public class _06직각이등변삼각형만들기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n : ");
        int n = sc.nextInt();

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 0; i <= n; i++) {
            System.out.println("*".repeat(i));
        }

    }
}