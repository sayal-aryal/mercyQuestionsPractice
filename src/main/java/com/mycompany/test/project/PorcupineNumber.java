///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.test.project;
//
///**
// *
// * @author user
// */
//public class PorcupineNumber {
//
//    public static void main(String[] args) {
//        System.out.println("The porcupineNumber is: " + findPorcupineNumber(20));
//    }
//
//    static int findPorcupineNumber(int n) {
//        int nextNumber = 0;
//        int porcupineNumber = 0;
//
//        for (int i = n; i <= Integer.MAX_VALUE; i++) {
//            nextNumber = i + 1;
//            if (isPrimeNumber(i)) {
//                if (i % 10 == 9) {
//                    if (isPrimeNumber(nextNumber)) {
//                        if (nextNumber % 10 == 9) {
//                            porcupineNumber = i;
//                            break;
//                        }
//
//                    }
//                }
//
//            }
//        }
//        return porcupineNumber;
//    }
//
//    public static boolean isPrimeNumber(int n) {
//        boolean isPrime = true;
//        for (int i = 2; i <= n / 2; i++) {
//            if (n % i == 0) {
//                isPrime = false;
//                break;
//
//            }
//        }
//        return isPrime;
//    }
//
//}
