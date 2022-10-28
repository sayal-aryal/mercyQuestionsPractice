/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class NUpcount {

    public static void main(String[] args) {
//        System.out.println("The upcount is: " + getUpcount(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 5));
        System.out.println("The upcount is: " + getUpcount(new int[]{6,3,1}, 6));
    }

    public static int getUpcount(int[] givenArray, int number) {
        int partialSum = 0;
        int count = 0;
        for (int i = 0; i < givenArray.length; i++) {

            partialSum += givenArray[i];

            if (partialSum > number) {
                count += 1;
            }

        }
        return count;

    }
}
