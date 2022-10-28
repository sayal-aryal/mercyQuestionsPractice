///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.test.project;
//
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// *
// * @author user
// */
//public class IsMadhavArray {
//
//    public static void main(String args[]) {
//        int intarray[] = {2, 1, 1, 4, -1, -1};
//        System.out.println("Is Madhav Array :" + isMadhavArray(intarray));
//    }
//
//    public static boolean isMadhavArray(int[] a) {
//        boolean isMadhavArray = false;
//        int ans = 0;
//        for (int i = 1; i <= a.length; i++) {
//
//            if (i >= 2) {
//                ans =ans + a[i-1];
//                if (a[0] == ans) {
//                    isMadhavArray = true;
//                } else {
//                    isMadhavArray = false;
//                }
//            }
//        }
//        return isMadhavArray;
//    }
//}
