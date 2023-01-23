/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class Hodder {

    public static void main(String args[]) {
        System.out.println("The GuthrieSequence Array is: " + isHodder(3)); //return 1
        System.out.println("The GuthrieSequence Array is: " + isHodder(7)); //return 1
        System.out.println("The GuthrieSequence Array is: " + isHodder(31));//return 1
        System.out.println("The GuthrieSequence Array is: " + isHodder(127));//return 1
        System.out.println("The GuthrieSequence Array is: " + isHodder(12));//return 0
        System.out.println("The GuthrieSequence Array is: " + isHodder(11));//return 0

    }

    public static int isHodder(int n) {

        int number = 1;
        for (int i = 1; i < n; i++) {
            if (n % i != 0 ||  i == 1) {
                number = number * 2;
                int actualNumber = number - 1;
                if (actualNumber == n) {
                    return 1;
                }
                if (actualNumber > n) {
                    return 0;
                }

            } else {
                return 0;
            }

        }

        return 0;
    }
}
