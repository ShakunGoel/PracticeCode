package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class BalancedStringSplit {
    private static int balancedStringSplit(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int count = 1;
        int stringCount = 0;
        map.put('R', 0);
        map.put('L', 0);
        for (int i = 0; i < s.length(); i = i + 1) {

            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), count);
            }
            if (map.get('R').equals(map.get('L'))) {
                stringCount++;
                map.put('R', 0);
                map.put('L', 0);
            }
        }
        return stringCount;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
    }
}
