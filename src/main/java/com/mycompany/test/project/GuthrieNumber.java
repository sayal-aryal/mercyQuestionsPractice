/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class GuthrieNumber {

    public static void main(String args[]) {
        System.out.println("The GuthrieSequence Array is: " + isGuthrieNumber(11)); // return 1
        System.out.println("The GuthrieSequence Array is: " + isGuthrieNumber(22)); // return 1
        System.out.println("The GuthrieSequence Array is: " + isGuthrieNumber(8)); // return 0
    }

    public static int isGuthrieNumber(int n) {

        int a = 1, j = 0;
        while (a < n) {
            a = a + j;

            j++;

        }
        if (a == n) {
            return 1;
        } else {
            return 0;
        }

    }
}
