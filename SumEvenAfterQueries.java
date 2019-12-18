package com.leetcode;

import java.util.Arrays;

public class SumEvenAfterQueries {
    public static int[] sumEvenAfterQueries() {
        int[] A = {1, 2, 3, 4};
        int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int[] output = new int[A.length];

        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][1];
            int val = queries[i][0];
            int sum = 0;
            A[index] = A[index] + val;
            for (int j = 0; j < A.length; j++) {
                if (A[j] % 2 == 0) {
                    sum = sum + A[j];
                }
            }
            output[i] = sum;
        }
        System.out.println(Arrays.toString(output));
        return output;
    }


    public static void main(String[] args) {
        sumEvenAfterQueries();
    }
}
