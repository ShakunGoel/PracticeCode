package com.leetcode;

public class ArrayPractice {
    public static int countCharacters() {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars;
        int sum = 0;
        int count;

        for (int i = 0; i < words.length; i++) {
            chars = "atach";
            count = 0;
            for (int j = 0; j < words[i].length(); j++) {
                String substring = words[i].substring(j, j + 1);
                if (chars.contains(substring)) {
                    chars = chars.replaceFirst(substring, "");
                    count++;
                }
            }
            if (count != words[i].length()) {
                count = 0;
            }
            sum = sum + count;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countCharacters());
    }
}
