///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mercy.question.practice;
//
///**
// *
// * @author user
// */
//public class ZeroPlentiful {
//
//    public static void main(String[] args) {
//        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0})); //return 1
//        System.out.println(isZeroPlentiful(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));//return 2
//        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}));//return 3
//        System.out.println(isZeroPlentiful(new int[]{1, 2, 3, 4})); //return 0
//        System.out.println(isZeroPlentiful(new int[]{1, 0, 0, 0, 2, 0, 0, 0, 0})); //return 0
//        System.out.println(isZeroPlentiful(new int[]{0})); //return 0
//        System.out.println(isZeroPlentiful(new int[]{})); //return 0
//    }
//
//    public static int isZeroPlentiful(int[] a) {
//        int zeroCount = 0;
//        int zeroCount1 = 0;
//        int count = 0;
//
//        for (int i = 0; i < a.length; i++) {
//
//            if (a[i] == 0) {
//
//                zeroCount++;
//            } else {
//                zeroCount = 0;
//
//            }
//            if (zeroCount >= 4) {
//                if (a.length != i + 1) {
//                    if (a[i] != a[i + 1]) {
//                        count ++;
//                    }
//                }
//            }
//
//        }
//
//        return count;
//    }
//}
