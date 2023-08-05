package com.example.mosyalgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalListIntersection {
    public static void main(String[] args) {
        int[][] firstList = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] secondList = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        System.out.println(Arrays.deepToString(IntervalListIntersection.intervalIntersection(firstList, secondList)));
    }

    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> result = new ArrayList<>();
        int n1 = firstList.length;
        int n2 = secondList.length;
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            int s1 = firstList[i][0];
            int e1 = firstList[i][1];
            int s2 = secondList[j][0];
            int e2 = secondList[j][1];
            if (s1 <= s2 && s2 <= e1 || s2 <= s1 && s1 <= e2) {
                int s = Math.max(s1, s2);
                int e = Math.min(e1, e2);
                int[] cur = {s, e};
                result.add(cur);
            }
            if (e2 > e1) {
                i++;
            } else {
                j++;
            }
        }
        return result.toArray(new int[result.size()][2]);
    }
}
