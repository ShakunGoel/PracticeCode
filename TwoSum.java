package com.leetcode;

import java.util.Arrays;

public class TwoSum {
    private static int[] twoSum(int[] nums, int target) {

        int[] indices = new int[2];
        if (nums.length > 2) {
            for (int j = 0; j < nums.length-1; j++) {
                for (int i = j + 1; i < nums.length; i++) {
                    if (nums[j] + nums[i] == target) {
                        indices[0] = j;
                        indices[1] = i;
                        break;
                    }
                }
            }
        } else {
            indices[0] = 0;
            indices[1] = 1;
        }

        System.out.println(Arrays.toString(indices));
        return indices;
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{3, 3}, 6));
    }
}
