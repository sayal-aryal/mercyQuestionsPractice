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
public class Inertial {

    public static void main(String args[]) {
        System.out.println("IS condition succed: " + isInertial(new int[]{1, 1, 1, 1, 1, 1, 2}));
    }

    public static boolean isInertial(int[] givenArray) {

        int maxvalue = 0;

        int[] oddArray = new int[givenArray.length];
        int[] evenArray = new int[givenArray.length];
        int oddLength = 0;
        int evenLength = 0;

//odd value Check
        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] % 2 != 0) {
                oddArray[oddLength++] = givenArray[i];
            } else {
                evenArray[evenLength++] = givenArray[i];
            }
            if (givenArray[i] > maxvalue) {
                maxvalue = givenArray[i];
            }

        }
        if (oddLength < 1 || maxvalue % 2 != 0) {
            return false;
        }
        for (int i = 0; i < oddLength; i++) {
            for (int j = 0; j < evenLength; j++) {
                if (evenArray[j] != maxvalue && evenArray[j] > oddArray[i]) {
                    return false;
                }

            }
        }

        return true;
    }
}
