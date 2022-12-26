/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class BeanArrayPg78 {

    public static void main(String[] args) {
        System.out.println("isBean  " + isBean(new int[]{21, 3, 7, 9, 11, 4, 6})); //return 1
        System.out.println("isBean  " + isBean(new int[]{13, 4, 4, 4, 4})); //return 0
        System.out.println("isBean  " + isBean(new int[]{10, 5, 5})); //return 1  
        System.out.println("isBean  " + isBean(new int[]{0, 6, 8, 20})); //return 1  
        System.out.println("isBean  " + isBean(new int[]{3})); //return 1  
        System.out.println("isBean  " + isBean(new int[]{8, 5, -5, 5, 3})); //return 0

    }

    public static int isBean(int[] a) {
        int sumofPrimeNumber = 0;
        int firstElement = 0;

        for (int i = 1; i < a.length; i++) {

            firstElement = a[0];
            boolean isPrimenumber = true;
            if (a[i] < 0) {
                isPrimenumber = false;
            }
            for (int j = 2; j <= a[i] / 2; j++) {
                if (a[i] % j == 0) {
                    isPrimenumber = false;
                }
            }

            if (isPrimenumber) {
                sumofPrimeNumber += a[i];
            }
        }

        if (sumofPrimeNumber == 0 && firstElement == 0) {
            return 1;
        }

        if (sumofPrimeNumber == firstElement) {
            return 1;
        }
        return 0;
    }

}
