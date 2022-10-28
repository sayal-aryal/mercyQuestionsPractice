/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class CompletePg61Q3 {

    public static void main(String[] args) {
        System.out.println("isComplete: " + isComplete(new int[]{-5, 6, 2, 3, 2, 4, 5, 11, 8, 7})); // return 1
        System.out.println("isComplete: " + isComplete(new int[]{5, 7, 9, 13})); // return 0
        System.out.println("isComplete: " + isComplete(new int[]{2, 2})); // return 0
        System.out.println("isComplete: " + isComplete(new int[]{2, 6, 3, 4})); // return 0
    }

    public static int isComplete(int[] a) {
        boolean containEvenNumber = false;
        int smallestNumber = Integer.MAX_VALUE;
        int largestNumber = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                if (a[i] % 2 == 0 && smallestNumber > a[i]) {
                    containEvenNumber = true;
                    smallestNumber = a[i];
                }
                if (a[i] % 2 == 0 && largestNumber < a[i]) {
                    containEvenNumber = true;
                    largestNumber = a[i];
                }

            }

        }

        if (!containEvenNumber) {
            return 0;
        }
        for (int i = smallestNumber + 1; i <= largestNumber - smallestNumber; i++) {
            boolean containNumber = false;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    containNumber = true;
                    break;
                }
                containNumber = false;
            }
            if (!containNumber) {
                return 0;
            }

        }
        if (smallestNumber == largestNumber) {
            return 0;
        }
        return 1;
    }

}
