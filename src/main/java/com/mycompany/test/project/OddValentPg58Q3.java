/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class OddValentPg58Q3 {

    public static void main(String[] args) {
        System.out.println("Is Odd isOddValent : " + isOddValent(new int[]{9, 3, 4, 9, 1})); // return 1
        System.out.println("Is Odd isOddValent : " + isOddValent(new int[]{3, 3, 3, 3})); // return 1
        System.out.println("Is Odd isOddValent : " + isOddValent(new int[]{8, 8, 8, 4, 4, 7, 2})); // return 1
        System.out.println("Is Odd isOddValent : " + isOddValent(new int[]{1, 2, 3, 4, 5})); // return 0
        System.out.println("Is Odd isOddValent : " + isOddValent(new int[]{2, 2, 2, 4, 4})); // return 0
    }

    public static int isOddValent(int[] a) {
        boolean containOdd = false;
        boolean containValueMoreThenOne = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                containOdd = true;
            }
            for (int j = i + 1; j < a.length - i; j++) {
                if (a[i] == a[j]) {
                    containValueMoreThenOne = true;
                }
            }

        }
        if (containOdd && containValueMoreThenOne) {
            return 1;
        }
        return 0;

    }

}
