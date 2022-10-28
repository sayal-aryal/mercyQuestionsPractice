/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class ContinuousFactored {

    public static void main(String args[]) {

        System.out.println("ContinuousFactored : " + isContinuousFactored(6)); //return 1
        System.out.println("ContinuousFactored : " + isContinuousFactored(60)); //return 1
        System.out.println("ContinuousFactored : " + isContinuousFactored(120)); //return 1
        System.out.println("ContinuousFactored : " + isContinuousFactored(90)); //return 1
    }

    static int isContinuousFactored(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                int product = i;
                for (int j = i + 1; j < n; j++) {
                    if (n % j != 0) {
                        break;
                    } else {
                        product *= j;
                        if (product == n) {
                            return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }
}
