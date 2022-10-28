/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class PrimeProduct {

    public static void main(String args[]) {

        System.out.println("Prime Product " + isPrimeProduct(22)); // return 1
        System.out.println("Prime Product " + isPrimeProduct(26)); // return 1
        System.out.println("Prime Product " + isPrimeProduct(11)); // return 0
        System.out.println("Prime Product " + isPrimeProduct(5)); // return 0
    }

    public static int isPrimeProduct(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrimeNumber(i)) {
                for (int j = 2; j < n; j++) {
                    if (isPrimeNumber(j) &&  i*j == n) {
                          return 1;
                    }
                }
            }
        }
        return 0;
    }

    public static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % 2 == 0 && number != i) {
                return false;
            }
        }

        return true;
    }
}
