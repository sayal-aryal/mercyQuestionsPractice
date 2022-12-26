/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * @author user
 */
public class ClosestFibonacci {

    public static void main(String args[]) {
        System.out.println("Is closestFibonacci " + closestFibonacci(12)); 
        System.out.println("Is closestFibonacci " + closestFibonacci(33));
        System.out.println("Is closestFibonacci " + closestFibonacci(34));
    }

    public static int closestFibonacci(int n) {

        int firstNumber = 0;
        int secondNumber = 1;
        int largestFibonacci = 0;

        for (int i = 0; i < n; i++) {

            int thirdNumber = firstNumber + secondNumber;
            if (thirdNumber > largestFibonacci) {
                largestFibonacci = thirdNumber;
            }

            if (thirdNumber == n) {
                return thirdNumber;
            }
            if (thirdNumber >= n) {
                return secondNumber;
            }

            firstNumber = secondNumber;
            secondNumber = thirdNumber;

        }
        return largestFibonacci;
    }
}
