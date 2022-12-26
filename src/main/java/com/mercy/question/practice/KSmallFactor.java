/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class KSmallFactor {

    public static void main(String args[]) {
        System.out.println("hasKSmallFactors: " + hasKSmallFactors(7, 30)); // return true
        System.out.println("hasKSmallFactors: " + hasKSmallFactors(6, 14)); // return false
        System.out.println("hasKSmallFactors: " + hasKSmallFactors(6, 30)); // return false
    }

    public static boolean hasKSmallFactors(int k, int n) {

        for (int i = 2; i <= n / 2; i++) {
            for (int j = 2; j <= n / 2; j++) {
                if (i * j == n && i < k & j < k) {
                    return true;
                }
            }

        }
        return false;
    }

}
