package com.leetcode;

import java.util.*;

public class UniqueMorseRepresntation {


    private static int uniqueMorseRepresentations(String[] words) {

        String[] morseRepresentation = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        int key = 0;
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (char i = 'a'; i <= 'z'; i++) {
            map.put(i, morseRepresentation[key]);
            key++;
        }

        String temp = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                temp = temp + map.get(words[i].charAt(j));
            }
            set.add(temp);
            temp = "";
        }
        return set.size();
    }


    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        uniqueMorseRepresentations(words);


    }
}
