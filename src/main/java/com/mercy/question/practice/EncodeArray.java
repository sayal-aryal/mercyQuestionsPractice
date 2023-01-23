/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class EncodeArray {

    public static void main(String[] args) {

//        int[] a = getEncodedArray(0);
//        int[] a = getEncodedArray(1);
//        int[] a = getEncodedArray(-1);
//        int[] a = getEncodedArray(100001);
        int[] a = getEncodedArray(999);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static int[] getEncodedArray(int n) {
        if (n == 0) {
            return new int[]{1};
        }
        int size = 0;
        while (n <= 0) {
            int rem = n % 10;
            n /= 10;
            size += 1;
        }
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-1; j++) {
                result[j]=0;
            }
        }
        return new int[]{0, 5};
    }
}
