/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class primeCount {

    public static void main(String[] args) {
        System.out.println("The Prime Number between two give number are: " + primeCount(10, 30));
//        System.out.println("The Prime Number between two give number are: " + primeCount(10));
    }

    public static int primeCount(int startNumber, int endNumber) {
        boolean isPrimeNumber = false;
        int primeCount = 0;
        for (int i = startNumber; i <= endNumber; i++) {

            for (int j = 2; j <= i / 2; j++) {
                if (i % j != 0) {
                    isPrimeNumber = true;
                } else {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                ++primeCount;
            }
        }

        return primeCount;
    }
}
