package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Java ile girilen sayının harmonik serisini bulan program yazacağız.
        Scanner input = new Scanner(System.in);
        System.out.print("n sayısı giriniz: ");
        int n = input.nextInt();
        double result = 0.0;
        for (double i = 1; i <= n; i++) {
            result += (1 / i);

        }
        System.out.println(result);


    }


}
