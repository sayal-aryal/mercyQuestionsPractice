/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class MeeraArrayPage65Q3 {

    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{3, 5, -2})); //return 1
        System.out.println(isMeera(new int[]{8, 3, 4})); //return 0
    }

    public static int isMeera(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == 2 * a[j]) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
