/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class DigitIncreasing {

    public static void main(String[] args) {
        System.out.println(isDigitIncreasing(7)); // return 1
        System.out.println(isDigitIncreasing(36)); // return 1
        System.out.println(isDigitIncreasing(984)); // return 1
        System.out.println(isDigitIncreasing(7404)); // return 1
        System.out.println(isDigitIncreasing(37)); // return 0
        System.out.println(isDigitIncreasing(38)); // return 0
        System.out.println(isDigitIncreasing(1107)); // return 1

    }

    public static int isDigitIncreasing(int n) {
        int tempNumber = n;
        int count = 0;

        do {
            tempNumber = tempNumber / 10;
            count++;
        } while (tempNumber >= 1);

        for (int i = 1; i <= 9; i++) {
            int sum = 0;
            int digit = 0;
            for (int j = 1; j <= count; j++) {
                sum = sum * 10 + i;
                digit += sum;
                if (digit == n) {
                    return 1;
                }

            }
        }
        return 0;

    }
}
