package com.example.mosyalgorithms;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] A, int K) {
        // base case (bazoviy variant)
        int n = A.length;
        if (n < 2 && 0 < K) return n;

        // define pointers (opredelit ukazateli)
        int L = 0, R = 0;

        // define MaxLen,counter (opredelit maximalnuyu dlinu i shetcik)
        int maxLen = 0, counter = 0;

        // longest ones
        while (R < n) {
            // expand the window (razvernut okno)

            // increase the counter if cur = 0 (uvelicit shetcik esli tekushiy = 0)
            if (A[R] == 0) {
                counter++;
            }
            // contract our window if condition doesn't meet (svernut nashe okno esli usloviya ne sovpadayut)
            while (K < counter) {
                if (A[L] == 0) {
                    counter--;
                }
                L++;
            }
            // update maxLen (obnovit maximalnuyu dlinu)
            maxLen = Math.max(maxLen, R - L + 1);

            // move the R one to the right (peremestit praviy pointer na pravo)
            R++;

        }

        // return maxLen (vernut maximalnuyu dlinu)
        return maxLen;
    }
}
