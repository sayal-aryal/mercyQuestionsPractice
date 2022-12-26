/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 * A number n is vesuvian if it is the sum of two different pairs of squares.
 * For example, 50 is vesuvian because 50 == 25 + 25 and 1 + 49. The numbers 65
 * (1+64, 16+49) and 85 (4+81, 36+49) are also vesuvian. 789 of the first 10,000
 * integers are vesuvian. Write a function named isVesuvian that returns 1 if
 * its parameter is a vesuvian number, otherwise it returns 0. Hint: be sure to
 * verify that your function detects that 50 is a vesuvian number!
 *
 */
public class Vesuvian {

    public static void main(String args[]) {
        System.out.println("Is Vesuvian Array: " + isVesuvian(50));
        System.out.println("Is Vesuvian Array: " + isVesuvian(65));
        System.out.println("Is Vesuvian Array: " + isVesuvian(85));
    }

    public static int isVesuvian(int a) {
        for (int i = 1; i < a; i++) {
//int isNumberSquare;
            for (int j = 1; j <= i; j++) {
                if (i/j == j) {

                    for (int k = 1; k <= j; k++) {
                        if (j / k == k) {
                            if (i + j == a) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
}
