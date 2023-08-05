package com.example.mosyalgorithms;

import java.util.HashMap;
import java.util.Map;

public class CountUniqueSubstrings {
    public static void main(String[] args) {
        String s = "xyzzaz";
        int size = 3;
        System.out.println(countUniqueSubstrings(s, size));

        String s2 = "xyzzab";
        int size2 = 3;
        System.out.println(countUniqueSubstrings(s2, size2));
    }

    public static int countUniqueSubstrings(String s, int size) {
        int count = 0;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            if (i >= size - 1) {
                if (map.size() == size) {
                    count++;
                }
                if (map.get(s.charAt(start)) > 1) {
                    map.put(s.charAt(start), map.getOrDefault(s.charAt(start), 0) - 1);
                } else {
                    map.remove(s.charAt(start));
                }
                start++;
            }
        }
        return count;
    }
}