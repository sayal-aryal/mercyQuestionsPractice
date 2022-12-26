/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

//1,1,5,7,61
/**
 *
 * @author user
 */
public class FancyNumber {

    public static void main(String[] args) {
        System.out.println(isFancy(5)); //return 1
        System.out.println(isFancy(6));//return 0
        System.out.println(isFancy(17));//return 1
        System.out.println(isFancy(11));//return 0
        System.out.println(isFancy(1));//return 1
        System.out.println(isFancy(69));//return 0
        System.out.println(isFancy(61));//return 1
    }

    public static int isFancy(int n) {
        int a = 1;
        int b = 1;
        int finalNumber = 0;
        if (n == 1) {
            return 1;
        }
        while (finalNumber < n) {

            finalNumber = 2 * a + 3 * b;
            a = b;
            b = finalNumber;
            if (n == finalNumber) {
                return 1;
            }

        }
        return 0;
    }
}
