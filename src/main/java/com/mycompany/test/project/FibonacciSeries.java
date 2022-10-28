/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class FibonacciSeries {

    public static void main(String args[]) {
        System.out.println("Is Fibonacci Series " + isFibonacci(21));
    }

    public static int isFibonacci(int n) {

        int firstNumber = 0;
        int secondNumber = 1;
        for (int i = 0; i <= (n / 2) + 1; i++) {

            int thirdNumber = firstNumber + secondNumber;

            if (thirdNumber == n) {
                return 1;
            }

            firstNumber = secondNumber;
            secondNumber = thirdNumber;

        }
        return 0;
    }
}
