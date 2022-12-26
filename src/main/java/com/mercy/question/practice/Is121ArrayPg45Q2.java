/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class Is121ArrayPg45Q2 {

    public static void main(String args[]) {
        System.out.println("Is 121Array " + is121Array(new int[]{1, 2, 1}));  //return 1
        System.out.println("Is 121Array " + is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));//return 1
        System.out.println("Is 121Array " + is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));//return 0
        System.out.println("Is 121Array " + is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1}));//return 0
        System.out.println("Is 121Array " + is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));//return 0
        System.out.println("Is 121Array " + is121Array(new int[]{1, 1, 1, 1, 1, 1}));//return 0
        System.out.println("Is 121Array " + is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 1}));//return 0
        System.out.println("Is 121Array " + is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2}));//return 0
        System.out.println("Is 121Array " + is121Array(new int[]{2, 2, 2}));//return 0
    }

    public static int is121Array(int[] a) {
        if (a[a.length / 2] != 2) {
            return 0;
        }
        if (a[0] != 1 || a[a.length - 1] != 1) {
            return 0;
        }
        int count1FromFront = 0;
        boolean isFirstLoopTrue = true;
        boolean isSecondLoopTrue = true;
        int count1FromBack = 0;
        for (int i = 0; i < a.length && isFirstLoopTrue; i++) {
            if (a[i] != 1) {
                isFirstLoopTrue = false;
                break;
            }
            ++count1FromFront;
        }
        for (int j = a.length - 1; j >= 0 && isSecondLoopTrue; j--) {
            if (a[j] != 1) {
                isSecondLoopTrue = false;
                break;
            }
            ++count1FromBack;
        }

        if (count1FromBack == count1FromFront) {
            return 1;
        }
        return 0;
    }
}
