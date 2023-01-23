/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercy.question.practice;

/**
 *
 * One word is an anagram of another word if it is a rearrangement of all the
 * letters of the second word. For example, the character arrays {'s', 'i', 't'}
 * and {'i', 't', 's'} represent words that are anagrams of one another because
 * "its" is a rearrangement of all the letters of "sit" and vice versa. Write a
 * function that accepts two character arrays and returns 1 if they are anagrams
 * of one another, otherwise it returns 0. For simplicity, if the two input
 * character arrays are equal, you may consider them to be anagrams. If you are
 * programming in Java or C#, the function signature is: int areAnagrams(char [
 * ] a1, char [ ] a2) If you are programming in C or C++, the function signature
 * is int areAnagrams(a1 char[ ], a2 char[ ], int len) where len is the length
 * of a1 and a2. Hint: Please note that "pool" is not an anagram of "poll" even
 * though they use the same letters. Please be sure that your function returns 0
 * if given these two words! You can use another array to keep track of each
 * letter that is found so that you don't count the same letter twice (e.g., the
 * attempt to find the second "o" of "pool" in "poll" should fail.) Hint: do not
 * modify either a1 or a2, i.e., your function should have no side effects! If
 * your algorithm requires modification of either of these arrays, you must work
 * with a copy of the array and modify the copy!
 */
public class Anagrams {

    public static void main(String[] args) {
        System.out.println(areAnagrams(new int[]{'s', 'i', 't'}, new int[]{'i', 't', 's'})); //return 1;
        System.out.println(areAnagrams(new int[]{'s', 'i', 't'}, new int[]{'i', 'd', 's'})); //return 0;
        System.out.println(areAnagrams(new int[]{'b', 'i', 'g'}, new int[]{'b', 'i', 't'})); //return 0;
        System.out.println(areAnagrams(new int[]{'b', 'o', 'g'}, new int[]{'b', 'o', 'o'})); //return 0;
        System.out.println(areAnagrams(new int[]{'b', 'i', 'g'}, new int[]{'b', 'i', 'g'})); //return 1;
        System.out.println(areAnagrams(new int[]{}, new int[]{})); //return 1;

    }

    public static int areAnagrams(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            boolean found = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    found = true;
                }
            }
            if (!found) {
                return 0;
            }
        }
        return 1;
    }
}
