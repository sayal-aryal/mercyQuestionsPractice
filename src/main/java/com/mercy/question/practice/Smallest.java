/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class Smallest {

    public static void main(String args[]) {

        System.out.println(smallest(2)); // return 12
        System.out.println(smallest(3));// return 124
        System.out.println(smallest(4));// return 624
        System.out.println(smallest(5));// return 624
        System.out.println(smallest(6));// return 642
        System.out.println(smallest(7));// return 4062
    }

    public static int smallest(int a) {
        int multiplynunber = 0;

        for (int i = 2;; i++) {
            int count = 0;

            for (int j = 1; j <= a; j++) {
                int multiply = i * j;
                while (multiply > 0) {
                    int rem = multiply % 10;
                    multiply = multiply / 10;
                    if (rem == 2) {
                        multiplynunber = i;
                        count++;
                        break;
                    }
                }

            }
            if (count == a) {
                break;
            }

        }
        return multiplynunber;
    }

}
