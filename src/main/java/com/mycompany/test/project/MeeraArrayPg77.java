/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

/**
 *
 * @author user
 */
public class MeeraArrayPg77 {

    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{-4, 0, 1, 0, 2})); //return 1
        System.out.println(isMeera(new int[]{-1, 0, 0, 8, 0})); //return 0
    }

    public static int isMeera(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > i) {
                return 0;
            }
        }
        return 1;
    }
}
