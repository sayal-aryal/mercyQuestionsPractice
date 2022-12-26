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
public class NormalNumber {

    public static void main(String[] args) {
        System.out.println("Is Meera Array1 : " + isNormal(1));
        System.out.println("Is Meera Array2 : " + isNormal(2));
        System.out.println("Is Meera Array3 : " + isNormal(3));
        System.out.println("Is Meera Array4 : " + isNormal(4));
        System.out.println("Is Meera Array5 : " + isNormal(5));
        System.out.println("Is Meera Array6 : " + isNormal(6));
        System.out.println("Is Meera Array7 : " + isNormal(7));
        System.out.println("Is Meera Array8 : " + isNormal(8));
        System.out.println("Is Meera Array9 : " + isNormal(9));

    }

    public static int isNormal(int a) {
        List<Integer> factors = new ArrayList();
        boolean containsOddNumber = false;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                factors.add(i);
            }
        }
        for (int i = 0; i < factors.size(); i++) {
            if (factors.get(i) % 2 != 0) {
                containsOddNumber = true;
            }

            if (containsOddNumber) {
                return 0;
            }
        }
        return 1;
    }

}
