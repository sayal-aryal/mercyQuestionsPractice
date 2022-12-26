/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class ComputeHMS {

    public static void main(String args[]) {
        computeHMS(3735);
        computeHMS(380);
        computeHMS(3650);
        computeHMS(55);
        computeHMS(0);
//        System.out.println("ComputeHMS " + computeHMS(380));
//        System.out.println("ComputeHMS " + computeHMS(3650));
//        System.out.println("ComputeHMS " + computeHMS(55));
//        System.out.println("ComputeHMS " + computeHMS(0));
    }

    public static int[] computeHMS(int second) {

        int hour = second / 3600;
        int number1 = second % 3600;
        int min = number1 / 60;
        int number3 = number1 % 60;
        System.out.print("{" + hour  + "," + min +","+ number3 + "}");
        return new int[]{hour, min, number3};

    }
}
