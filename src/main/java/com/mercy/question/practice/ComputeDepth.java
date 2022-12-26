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
public class ComputeDepth {

    public static void main(String args[]) {
        int testedNumber = 25;
        System.out.println("The compute depth of the given number is: " + computeDepth(testedNumber));
    }

    public static int computeDepth(int n) {
        List numberStoredList = new ArrayList();
        int count = 0;

        for (int i = 1;; i++) {

            char[] charResults = String.valueOf(n * i).toCharArray();

            for (int j = 0; j < charResults.length; j++) {

                if (!numberStoredList.contains(charResults[j])) {
                    numberStoredList.add(charResults[j]);

                }

            }
            count++;
            if (numberStoredList.size() == 10) {
                break;
            }

        }
        return count;
    }
}
