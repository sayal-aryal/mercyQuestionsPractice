/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class FactorEqual {

    public static void main(String args[]) {
        System.out.println("Factor Equal " + factorEqual(10, 33)); // return 1
        System.out.println("Factor Equal " + factorEqual(9, 10)); // return 0
    }

    public static int factorEqual(int n, int o) {
        int nFactorCount = 0;
        int oFactorCount = 0;
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0) {
                ++nFactorCount;
            }
        }
        for (int j = 1; j <= o; j++) {
            if (o % j == 0) {
                ++oFactorCount;
            }
        }
        if (nFactorCount == oFactorCount) {
            return 1;
        }
        return 0;
    }
}
