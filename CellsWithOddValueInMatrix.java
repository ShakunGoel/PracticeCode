package com.leetcode;

import java.util.ArrayList;

public class CellsWithOddValueInMatrix {
    public static int oddCells(int n, int m, int[][] indices) {

        int[][] newMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newMatrix[i][j] = 0;
            }
        }
        int num = 0;
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        for (int[] index : indices) {

            row.add(index[0]);
            col.add(index[1]);

        }
        for (Integer integer : row) {
            for (int j = 0; j < m; j++) {
                newMatrix[integer][j] = newMatrix[integer][j] + 1;
            }
        }
        for (Integer integer : col) {
            for (int j = 0; j < n; j++) {
                newMatrix[j][integer] = newMatrix[j][integer] + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (newMatrix[i][j] % 2 != 0) {
                    num++;
                }
            }
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(oddCells(2, 2, new int[][]{{1, 1}, {0, 0}}));
    }
}
