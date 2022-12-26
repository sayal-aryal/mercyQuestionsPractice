/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
  
                                                Question from Maharishi website.

Write a function that accepts a character array, a zero-based start position and a length. It should return a character array containing containing lengthcharacters starting with the startcharacter of the input array. The function should do error checking on the start position and the length and return null if the either value is not legal.
The function signature is:
char[ ] f(char[ ] a, int start, int len)
 */
package com.mercy.question.practice;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class CharArrayExample {

    public static void main(String[] args) {
        char characterArray[] = {'a', 'b','c'};
        int start = 2;
        int givenLength =2;
        System.out.println("The charater Array is: " + Arrays.toString(f(characterArray, start, givenLength)) );

    }

    public static char[] f(char[] charArray, int start, int givenLength) {
        char[] returnCharArray = new char[givenLength];

        if (charArray.length == 0 || charArray.length < givenLength || start < 0 || givenLength <= 0 || charArray.length<=start+givenLength-1 ) {
            return null;
        }
        for (int i = start, j = 0; j < givenLength; i++, j++) {

            returnCharArray[j] = charArray[i];

        }
        return returnCharArray;
    }

}
