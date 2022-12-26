/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

//3. Write a function that takes two arguments, an array of integers and a positive, non-zero number n. It sums n elements of the array 
//starting at the beginning of the array. If n is greater than the number of elements in the array, the function loops back to the beginning 
//of the array and continues summing until it has summed n elements. You may assume that the array contains at least one element and 
//that n is greater than 0. 
//If you are programming in Java or C#, the function signature is
//int loopSum(int[ ] a, int n)
//If you are programming in C or C++, the function signature is
//int loopSum(int a[ ], int len, int n) where len is the number of elements in the array 
//Examples
//If a is and n
//is then function returns 
//{1, 2, 3} 2 3 (which is a[0] + a[1]) 
//{-1, 2, -1} 7 -1 (which is a[0] + a[1] + a[2] + a[0] + a[1] + a[2] + 
//a[0]) 
//{1, 4, 5, 6} 4 16 (which is a[0] + a[1] + a[2] + a[3]) 
//{3} 10 30 
//(a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0]+a[0])

public class LoopSum {

    public static void main(String args[]) {
        System.out.println("loopSum: " + loopSum(new int[]{1, 2, 3}, 2)); // return 3
        System.out.println("loopSum: " + loopSum(new int[]{-1, 2, -1}, 7)); // return -1
        System.out.println("loopSum: " + loopSum(new int[]{1, 4, 5, 6}, 4)); // return 16
        System.out.println("loopSum: " + loopSum(new int[]{3}, 10)); // return 30
    }

    public static int loopSum(int[] a, int n) {
        int sum = 0;
        int count = 0;
        int i = 0;
        while (i < n) {
            sum = sum + a[count];
            if (count == a.length - 1) {
                count = -1;
            }
            count++;
            i++;
        }
        return sum;
    }
}
