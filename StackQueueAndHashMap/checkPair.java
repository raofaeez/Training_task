package StackQueueAndHashMap;

import java.util.HashMap;

public class checkPair {

    public static boolean hasPairWithSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : arr) {
            int complement = target - val;

            if (map.containsKey(complement)) {
                return true; // pair found
            }

            map.put(val, 1); // store element
        }
        return false; // no pair found
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        if (hasPairWithSum(arr, target)) {
            System.out.println("Pair exists");
        } else {
            System.out.println("Pair does not exist");
        }
    }
}