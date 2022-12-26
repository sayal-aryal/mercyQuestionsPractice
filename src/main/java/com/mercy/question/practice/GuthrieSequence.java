/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;
/**
 *
 * @author user
 */
public class GuthrieSequence {

    public static void main(String args[]) {
        int givenArray[] = {8,4,2,1};
        System.out.println("The GuthrieSequence Array is: " + isGuthrieSequence(givenArray));

    }

    public static int isGuthrieSequence(int[] givenArray) {
        int nextElement = 0;
        for (int i = 0; i < givenArray.length - 1; i++) {
            nextElement = givenArray[i + 1];
            if (givenArray[i] % 2 != 0) {
                nextElement = (givenArray[i] * 3) + 1;
            } else {
                nextElement = givenArray[i] / 2;
            }
        }
        if (nextElement == 1) {
            return 1;
        }
        return 0;
    }
}
