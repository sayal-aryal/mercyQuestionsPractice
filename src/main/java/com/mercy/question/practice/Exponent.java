/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class Exponent {

    public static void main(String[] args) {
        System.out.println(getExponent(162, 3)); // return 4
        System.out.println(getExponent(27, 3)); // return  3
        System.out.println(getExponent(28, 3));// return 0
        System.out.println(getExponent(280, 7));// return 1
        System.out.println(getExponent(-250, 5));// return 3
        System.out.println(getExponent(18, 1));// return -1
        System.out.println(getExponent(128, 4));// return 3
    }

    public static int getExponent(int n, int p) {
        int count = 0;
        if (p <= 1) {
            return -1;
        }
        while (n != 0) {
            if (n % p == 0) {
                n /= p;
                count++;
            } else {
                return count;
            }

        }
        return count;
    }
}
