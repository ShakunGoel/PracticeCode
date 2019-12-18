package com.leetcode;

import java.util.Arrays;

public class DuplicateZeros {
    public static void duplicateZeros() {
        int[] arr = {1, 0, 2, 3};
        for (int i = 0; i < arr.length; ) {
            if (arr[i] == 0) {
                for (int j = arr.length; j > i + 1; j--) {
                    arr[j - 1] = arr[j - 2];
                }
                i = i + 2;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        duplicateZeros();
    }
}
