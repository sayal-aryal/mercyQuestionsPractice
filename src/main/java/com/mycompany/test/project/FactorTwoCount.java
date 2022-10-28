/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class FactorTwoCount {

    public static void main(String args[]) {
        System.out.println("Factor Two Count " + factorTwoCount(48)); // return 4
        System.out.println("Factor Two Count " + factorTwoCount(27)); // return 0
        System.out.println("Factor Two Count " + factorTwoCount(36)); // return 2
        System.out.println("Factor Two Count " + factorTwoCount(30)); // return 1
    }

    public static int factorTwoCount(int n) {
        int number = 0;
        int count = 0;
        while (n >= 1) {
            if (n % 2 == 0) {
                n = n / 2;
                ++count;
            } else {
                return count;
            }

        }
        return count;
    }
}
