package Arrays;
// Leetcode-Two Sum
//Approach :HashMap
//store numbers seen so far in a map
//for the current x, check if target - x already exists in the map
//if it does, return the pair immediately

//Time Complexity-O(n)
//space Complexity-O(n)

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];
            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 2, 7, 11, 15 };
        // int arr1[] = new int[]{3,2,4};
        int[] result = twoSum(arr, 9);
        // int[]result1=twoSum(arr1, 6);
        System.out.println(Arrays.toString(result));

    }
}
