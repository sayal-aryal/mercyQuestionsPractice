/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class IsHollow {

    public static void main(String args[]) {
        System.out.println("Is Hollow " + isHollow(new int[]{1, 2, 4, 0, 0, 0, 3, 4, 5}));
    }

    public static boolean isHollow(int[] arr) {
        int halfLength = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 0) {
                return false;
            }
            if (arr[halfLength] == 0 && arr[halfLength - 1] == 0 && arr[halfLength + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
