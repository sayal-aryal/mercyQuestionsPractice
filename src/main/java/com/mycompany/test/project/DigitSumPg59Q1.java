/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class DigitSumPg59Q1 {

    public static void main(String[] args) {
        System.out.println(isDigitSum(32121, 10)); //return 1
        System.out.println(isDigitSum(32121, 9)); // return 0
        System.out.println(isDigitSum(13, 6)); // return 1
        System.out.println(isDigitSum(3, 3)); // return 0 
    }

    public static int isDigitSum(int n, int m) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;

            sum = sum + rem;
        }

        if (sum >= m) {
            return 0;
        }
        return 1;
    }
}
