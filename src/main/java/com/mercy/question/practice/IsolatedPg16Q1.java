/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class IsolatedPg16Q1 {

    public static void main(String args[]) {
        System.out.println("2 Is Isolated: " + isIsolated(2)); // return 1
        System.out.println("3 Is Isolated: " + isIsolated(3));// return 1
        System.out.println("8 Is Isolated: " + isIsolated(8));// return 1
        System.out.println("9 Is Isolated: " + isIsolated(9));// return 1
        System.out.println("14 Is Isolated: " + isIsolated(14));// return 1
        System.out.println("24 Is Isolated: " + isIsolated(24));// return 1
        System.out.println("28 Is Isolated: " + isIsolated(28));// return 1
        System.out.println("34 Is Isolated: " + isIsolated(34));// return 1
        System.out.println("58 Is Isolated: " + isIsolated(58));// return 1
        System.out.println("63 Is Isolated: " + isIsolated(63));// return 1
        System.out.println("4 Is Isolated: " + isIsolated(4));// return 0
        System.out.println("5 Is Isolated: " + isIsolated(5));// return 0
        System.out.println("6 Is Isolated: " + isIsolated(6));// return 0
        System.out.println("64 Is Isolated: " + isIsolated(64));// return 0
    }

    public static int isIsolated(int n) {
        int square1 = n * n;
        int cube1 = n * n * n;

        int cube2 = n * n * n;
        int cubeLoopnumber = 0;
        int squareLoopnumber = 0;

        while (cube1 > 0) {
            int curem = cube1 % 10;
            cube1 = cube1 / 10;
            cubeLoopnumber++;
        }
        while (square1 > 0) {
            int sqrem = square1 % 10;
            square1 = square1 / 10;
            squareLoopnumber++;
        }

        for (int i = 0; i < cubeLoopnumber; i++) {
            int curem = cube2 % 10;
            cube2 = cube2 / 10;
            int square2 = n * n;
            for (int j = 0; j < squareLoopnumber; j++) {
                int sqrem = square2 % 10;
                square2 = square2 / 10;
                if (curem == sqrem) {
                    return 0;
                }

            }
        }
        return 1;
    }
}
