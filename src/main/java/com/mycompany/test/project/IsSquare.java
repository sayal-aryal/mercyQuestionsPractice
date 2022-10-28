/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class IsSquare {

    public static void main(String args[]) {
        System.out.println("Is Perfect Square: " + isSquare(0));
    }

    public static int isSquare(int n) {
        int squareNumber = 0;
        for (int i = 2; i <= n / 2; i++) {
            squareNumber = i * i;

            if (squareNumber == n) {
                return 1;
            }
        }
        return 0;
    }

}
