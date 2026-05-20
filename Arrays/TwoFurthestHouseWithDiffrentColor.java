//Leetcode:2078 Two Furthest House With Diffrent Color
//Approach: compare with the two farthest point 
//return max

//Time complexity: O(n)
//Space Complexity: O(1)

package Arrays;

public class TwoFurthestHouseWithDiffrentColor {
    static int maxDistance(int[] arr) {
        int n = arr.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[0]) {
                Math.max(max, i);
            }
            if (arr[i] != arr[n - 1]) {
                Math.max(max, n - 1 - i);
            }
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
