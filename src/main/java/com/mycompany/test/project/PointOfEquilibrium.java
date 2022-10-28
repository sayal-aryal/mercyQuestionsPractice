/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class PointOfEquilibrium {

    public static void main(String args[]) {

        System.out.println("The pos is: " + pointofEquilibrium(new int[]{1, 8, 3, 7, 10, 12}));;
    }

    public static int pointofEquilibrium(int[] givenArray) {
        int sumFromFront = 0;
        int sumFromLast = 0;
        for (int i = 0; i < givenArray.length; i++) {
            for (int j = givenArray.length; j > 0; j--) {
                sumFromFront += givenArray[i];
                sumFromLast += givenArray[j];
                if (i-1==j || j-1==i) {
                    return -1;
                }
                if (sumFromFront == sumFromLast) {
                    return i + 1;
                }
            }
        }
        return -1;
    }
}
