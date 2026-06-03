//Leetcode 977: Sorted Square Array
//Approach:Two pointer
//Compare the square of two end point and then place it from the end in result array

//Time Complexity:O(n)
//Space Complexity: O(n)

package Arrays;
import java.util.*;
public class SquareOfSortedArray {
    static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int[] result = new int[n];
        int index = n - 1;
        while (start <= end) {
            int leftSq = nums[start] * nums[start];
            int rightSq = nums[end] * nums[end];
            if (leftSq > rightSq) {
                result[index] = leftSq;
                start++;
            } else {
                result[index] = rightSq;
                end--;
            }
            index--;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { -4, -1, 0, 3, 10 };
        int result[] = sortedSquares(arr);
        System.out.println(Arrays.toString(result));
    }
}
