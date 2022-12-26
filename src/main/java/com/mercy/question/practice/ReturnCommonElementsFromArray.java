/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class ReturnCommonElementsFromArray {

    public static void main(String args[]) {

        int firstArray[] = {1, 2};
        int secontArray[] = {3, 4};
//        System.out.println("The common elements are: " + Arrays.toString(getCommonElementsFromArray(firstArray, secontArray)));
        getCommonElementsFromArray(firstArray, secontArray);
    }

    public static void getCommonElementsFromArray(int[] firstArray1, int[] secondArray2) {
        int firstArray[] = {1, 2};
        int secondArray[] = {};

        int a[] = new int[firstArray.length];
        int k = 0;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    a[k] = firstArray[i];
                    k++;
                }
            }
        }
        int[] retArray = new int[k];

        for (int t = 0; t < retArray.length; t++) {
            retArray[t] = a[t];
        }
        System.out.println(Arrays.toString(retArray));
    }
}
