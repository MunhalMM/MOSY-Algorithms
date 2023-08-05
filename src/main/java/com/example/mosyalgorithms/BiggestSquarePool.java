package com.example.mosyalgorithms;

public class BiggestSquarePool {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        BiggestSquarePool biggestSquarePool = new BiggestSquarePool();
        System.out.println(biggestSquarePool.maxArea(height));

    }

    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int hLeft = height[left];
            int hRight = height[right];
            int length = right - left;
            max = Math.max(max, Math.min(hLeft, hRight) * length);
            if (hLeft < hRight) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

}
