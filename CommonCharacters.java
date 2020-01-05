package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonCharacters {
    private static List<String> commonChars(String[] A) {

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> mapFinal = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < A[0].length(); i++) {
            if (map.containsKey(A[0].charAt(i))) {
                map.put(A[0].charAt(i), (map.get(A[0].charAt(i)) + 1));
            } else {
                map.put(A[0].charAt(i), 1);
            }
        }
        for (int j = 1; j < A.length; j++) {
            for (int k = 0; k < A[j].length(); k++) {
                if (mapFinal.containsKey(A[j].charAt(k))) {
                    mapFinal.put(A[j].charAt(k), (mapFinal.get(A[j].charAt(k)) + 1));
                } else {
                    mapFinal.put(A[j].charAt(k), 1);
                }
            }

            for (Character key : map.keySet()) {
                if (!mapFinal.containsKey(key)) {
                    map.put(key, 0);
                }
            }

            for (Character key : map.keySet()) {
                if (map.get(key) != 0)
                    if ((map.get(key) >= mapFinal.get(key))) {
                        map.put(key, mapFinal.get(key));
                    }
            }
            mapFinal.clear();
        }
        for (Character key : map.keySet()) {
            for (int repeat = 0; repeat < map.get(key); repeat++) {
                list.add(String.valueOf(key));
            }
        }

        return list;
    }

    public static void main(String[] args) {
        commonChars(new String[]{"cool", "lock", "cook"});
    }
}
