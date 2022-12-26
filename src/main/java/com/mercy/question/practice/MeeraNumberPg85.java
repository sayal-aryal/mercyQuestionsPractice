/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class MeeraNumberPg85 {

    public static void main(String[] args) {
        System.out.println("Is Meera Array : " + meeraNumber(6));
        System.out.println("Is Meera Array : " + meeraNumber(30));
        System.out.println("Is Meera Array : " + meeraNumber(21));

    }

    public static int meeraNumber(int n) {

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if ((count > 1) && (n % count == 0)) {
            return 1;
        }
        return 0;
    }
}
