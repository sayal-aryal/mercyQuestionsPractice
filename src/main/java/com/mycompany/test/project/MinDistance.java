/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class MinDistance {

    public static void main(String args[]) {
        System.out.print("Minimum Distance is: " + minDistance(8));
    }

    public static int minDistance(int n) {
        List<Integer> list = new ArrayList();
        int minDistance = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                int difference = list.get(i) - list.get(j);
                if (difference > 0 && difference < minDistance) {
                    minDistance = difference;
                }
            }
        }
        return minDistance;
    }
}
