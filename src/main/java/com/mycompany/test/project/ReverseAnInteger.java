/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 Question from Maharishi website.

Write a function to reverse an integer using numeric operators and without using any arrays or other data structures.
The signature of the function is:
int f(int n)

 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class ReverseAnInteger {

    public static void main(String args[]) {
        System.out.println(reverseInteger(1234));
    }

    public static int reverseInteger(int givenInteger) {
        int reverseNumber = 0;
        while (givenInteger != 0) {
            reverseNumber = (reverseNumber * 10) + (givenInteger % 10);
            givenInteger = givenInteger / 10;
        }
        return reverseNumber;
    }
}
