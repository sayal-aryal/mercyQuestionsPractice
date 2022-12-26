/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class CountDigit {

    public static void main(String args[]) {

        System.out.println("Count Digit " + countDigit(33331, 3)); // returns 4
        System.out.println("Count Digit " + countDigit(33331, 6)); // returns 0
        System.out.println("Count Digit " + countDigit(3, 3)); // returns 1
    }

    public static int countDigit(int n, int t) {
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            if (rem == t) {
                ++count;
            }
        }
        return count;
    }

}
