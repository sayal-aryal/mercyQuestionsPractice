/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author user
 */
public class Fill {

    public static void main(String[] args) {
        int[] givenArray = {1, 2, 3, 5, 9, 12, -2, -1};
        int k = 3;
        int n = 10;

        for (int number : fill(givenArray, k, n)) {
            System.out.print(number);
        }

//        System.out.println("1,2,3,1,2,3,1,2,3,1: " + (fill(givenArray, k, n).toString()));
//        System.out.println("4,2,-3,12}, 1, 5:  " + (fill(new int[]{4, 2, -3, 12}, 1, 5).toString()));
//        System.out.println("{2, 6, 9, 0, -3}, 0, 4:  " + (fill(new int[]{2, 6, 9, 0, -3}, 0, 4)));
    }

//    public static List<Integer> fill(int[] arr, int k, int n) {
//        List returnList = new ArrayList();
//
//        if (k == 0) {
//            return null;
//        }
//
//        for (int j = 0; j < k; j++) {
//
//            returnList.add(arr[j]);
//        }
//        for (int l = 0;; l++) {
//
//            returnList.add(returnList.get(l));
//            if (returnList.size() == n) {
//                return returnList;
//            }
//        }
//    }
    public static int[] fill(int[] arr, int k, int n) {
        int[] returnArray = new int[n];
        int j = 0;

        if (k == 0) {
            return null;
        }
        for (int i = 0; i < n; i++) {

            returnArray[i] = arr[j];
            j++;

            if (j >= k) {
                j = 0;
            }

        }
        return returnArray;
    }

}
