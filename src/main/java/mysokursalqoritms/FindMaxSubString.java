package mysokursalqoritms;

import java.util.HashSet;
import java.util.Set;

public class FindMaxSubString {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(findMaximumSubstring(s));
    }

    public static int findMaximumSubstring(String s) {

        int start = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();  // empty
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);  // a , b , c , a , b
            while (set.contains(c)) {  // set = abc , c = a;
                set.remove(s.charAt(start));   // start = 0 = a;  bc , start = 1  =b , ca
                start++;
            }

            set.add(c); ///  bca , cab
            max = Math.max(max, i - start + 1); // 1 ,2 ,3
        }

        return max;
    }
}
