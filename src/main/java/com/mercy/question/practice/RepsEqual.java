/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author user
 */
public class RepsEqual {

    public static void main(String args[]) {
        int number = 32053;
        System.out.println("Is the array are in same order: " + repsEqual(new int[]{0, 3, 2, 0, 5, 3}, number));
    }

    public static int repsEqual(int[] givenArray, int number) {

//        final String result = IntStream
//                .of(givenArray)
//                .boxed()
//                .map(String::valueOf)
//                .collect(Collectors.joining());
//        final int intResult = Integer.parseInt(result);
//
//        if (intResult == number) {
//            return 1;
//        }
//        return 0;

        int result = 0;
        for (int i = 0; i < givenArray.length; i++) {
            result = result * 10 + givenArray[i];
        }
        if (result == number) {
            return 1;
        }
        return 0;
    }

}
