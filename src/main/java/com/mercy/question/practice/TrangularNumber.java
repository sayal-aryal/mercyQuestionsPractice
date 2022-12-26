/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class TrangularNumber {

    public static void main(String args[]) {
        System.out.println(isTrangularNumber(1));// return 1
        System.out.println(isTrangularNumber(3));// return 1
        System.out.println(isTrangularNumber(6));// return 1
        System.out.println(isTrangularNumber(10));// return 1
        System.out.println(isTrangularNumber(11));// return 0
    }

    public static int isTrangularNumber(int number) {
        int sum = 0;
        for (int i = 1;; i++) {
            sum += i;
            if (sum == number) {
                return 1;
            }
            if (sum > number) {
                return 0;
            }
        }
    }
}
