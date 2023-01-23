/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class FactorialPrime {

    public static void main(String args[]) {
        System.out.println("Factor Two Count " + factorialPrime(2)); // return 1
        System.out.println("Factor Two Count " + factorialPrime(3)); // return 1
        System.out.println("Factor Two Count " + factorialPrime(7)); // return 1
        System.out.println("Factor Two Count " + factorialPrime(8)); // return 0
        System.out.println("Factor Two Count " + factorialPrime(11)); // return 0
        System.out.println("Factor Two Count " + factorialPrime(721)); // return 0
    }

    public static int factorialPrime(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            if (n == 2) {
                return 1;
            }
            if (n % i == 0 && n != 2) {
                return 0;
            }
            factorial = factorial * i;
            int finalNumber = factorial + 1;
            if (finalNumber == n && n % i != 0) {
                return 1;
            }
        }

        return 0;
    }
}
