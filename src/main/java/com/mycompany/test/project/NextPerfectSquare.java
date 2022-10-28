/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

import javax.sound.midi.SysexMessage;

/**
 *
 * @author user
 */
public class NextPerfectSquare {

    public static void main(String[] args) {
        System.out.println("The next perfect square is: " + getPerfectSquare(6));
    }

    public static int getPerfectSquare(int n) {
        int ans;
        for (int i = 1;; i++) {

            ans = i * i;
            if (ans > n)  break;
           
        }
        return ans;

    }

}
