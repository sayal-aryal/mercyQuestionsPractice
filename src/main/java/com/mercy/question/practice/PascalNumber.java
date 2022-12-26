/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class PascalNumber {

    public static void main(String[] args) {
        System.out.println(isPascal(6));//1
        System.out.println(isPascal(15)); //1
        System.out.println(isPascal(7));    //0
    }

    public static int isPascal(int a) {
        int number = 0;
        for (int i = 1;; i++) {

            number += i;
            if (number == a) {
                return 1;
            }
            if (number > a) {
                return 0;
            }
        }
    }
}
