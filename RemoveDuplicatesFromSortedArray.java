package com.leetcode;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {

    private static int removeDuplicates(int nums[]) {

        int count = 0;
        Set<Integer> set1 = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set1.add(nums[i]);
        }
        System.out.println(set1.toString());
        Iterator<Integer> itr = set1.iterator();

        while (itr.hasNext()) {
            for (int i = 0; i < set1.size(); i++) {
                nums[i] = itr.next();
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{-3, -1, 0, 0, 0, 3, 3};
        int t = removeDuplicates(nums);


        for (int i = 0; i < t; i++) {
            System.out.println("nums after fun call" + nums[i]);
        }
    }
}
