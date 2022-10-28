/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class Solve10 {

    public static void main(String[] args) {
        int[] result = solve10();
        for (int number : result) {
            System.out.println("The numbers are: " + number);
        }
    }

    static int[] solve10() {

        int tenFactorial = 1;
        int x = 0;
        int y = 0;

        int[] factorial = new int[2];
        boolean factorialFound = false;

        for (int i = 1; i <= 10; i++) {
            tenFactorial = tenFactorial * i;
        }

        for (x = 1; x <= 10; x++) {
            int xFactorial = 1;
            for (int i = 1; i <= x; i++) {
                xFactorial = xFactorial * i;
            }

            for (y = 1; y <= 10; y++) {
                int yFactorial = 1;
                for (int j = 1; j <= 10; j++) {
                    yFactorial = yFactorial * j;
                }

                if (xFactorial + yFactorial == tenFactorial) {
                    factorialFound = true;
                    break;
                }

            }

            if (factorialFound) {
                break;
            }
        }

        factorial[0] = x;
        factorial[1] = y;

        return factorial;
    }

}
