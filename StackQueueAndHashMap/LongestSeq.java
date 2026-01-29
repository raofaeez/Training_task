package StackQueueAndHashMap;

import java.util.HashSet;

public class LongestSeq {

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();

        if (nums.length == 0) {
            return 0;
        }

        for (int val : nums) {
            st.add(val);
        }

        int maxi = 0;

        for (int num : st) {
            // start of a sequence
            if (!st.contains(num - 1)) {
                int curr = num;
                int ans = 1;

                while (st.contains(curr + 1)) {
                    curr++;
                    ans++;
                }
                maxi = Math.max(maxi, ans);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};

        int result = longestConsecutive(nums);
        System.out.println("Longest Consecutive Sequence Length: " + result);
    }
}