/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class BEQNumber {

    public static void main(String[] args) {
        System.out.println(findSmallestBEQnumber(806)); //return 1;
        System.out.println(findSmallestBEQnumber(36)); //return 0;
        System.out.println(findSmallestBEQnumber(1118)); //return 0;

    }

    public static int findSmallestBEQnumber(int a) {
        int cube = a * a * a;
        int countSix = 0;
        while (cube > 0) {
             int rem = cube % 10;
            if (rem == 6) {
                ++countSix;
            }
            cube = cube / 10;
        }
        if (countSix == 4) {
            return 1;
        }
        return 0;
    }
}
