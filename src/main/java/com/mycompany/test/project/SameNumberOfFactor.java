/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class SameNumberOfFactor {

    public static void main(String args[]) {
        System.out.println(sameNumberOfFactors(-6, 21));
        System.out.println(sameNumberOfFactors(6, 21));
        System.out.println(sameNumberOfFactors(8, 12));
        System.out.println(sameNumberOfFactors(23, 97));
        System.out.println(sameNumberOfFactors(0, 1));
        System.out.println(sameNumberOfFactors(0, 0));
    }

    public static int sameNumberOfFactors(int a, int b) {
        int firstFactorCount = 0;
        int secondFactorCount = 0;
        if (a < 0 || b < 0) {
            return -1;
        }
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                firstFactorCount++;
            }
        }

        for (int j = 1; j <= b; j++) {
            if (b % j == 0) {
                secondFactorCount++;
            }
        }

        if (firstFactorCount == secondFactorCount) {
            return 1;
        }
        return 0;
    }
}
