/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class NUnique {

    public static void main(String args[]) {
        System.out.println("Is the given list is NUnique: " + isNUnique(new int[]{7, 3, 3, 2, 4}, 11));
    }

    public static int isNUnique(int[] givenArray, int n) {
        int sum = 0;
        int count = 0;

        if (givenArray.length < 2) {
            return 0;
        }
        for (int i = 0; i < givenArray.length; i++) {

            for (int j = i; j < (givenArray.length - 1) - i; j++) {
                sum = givenArray[i] + givenArray[j];
                if (sum == n) {
                    count++;
                }
            }
        }
        if (count > 1) {
            return 0;
        }
        return 1;
    }
}
