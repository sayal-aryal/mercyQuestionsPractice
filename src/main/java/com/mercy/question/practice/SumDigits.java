/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class SumDigits {

    public static void main(String[] args) {
        System.out.println(sumDigits(3114)); // return 9
        System.out.println(sumDigits(-6543)); // return 18
        System.out.println(sumDigits(0)); // return 0
    }

    public static int sumDigits(int n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {

            int b = n % 10;
            n = n / 10;
            sum += b;

        }
        return sum;
    }
}
