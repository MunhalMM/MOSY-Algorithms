package com.example.mosyalgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s, p));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        int[] arrp = new int[26];
        int[] arrs = new int[26];

        for (int i = 0; i < p.length(); i++) {
            arrp[p.charAt(i) - 'a']++;
        }
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            arrs[s.charAt(i) - 'a']++;
            if (i >= p.length() - 1) {
                if (Arrays.equals(arrp, arrs)) {
                    list.add(start);
                }
                arrs[s.charAt(start) - 'a']--;
                start++;
            }

        }
        return list;
    }
}
