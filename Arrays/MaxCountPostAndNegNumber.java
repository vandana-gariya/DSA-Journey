// Leetcode: 2529 Maximum Count of Positive Integer and Negative Integer

//Time Complexity: O(n)
//Space Complexity: O(1)
package Arrays;

public class MaxCountPostAndNegNumber {
    static int maximumCount(int arr[]) {
        int n = arr.length;
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                negativeCount++;
            } else if (arr[i] > 0) {
                positiveCount++;
            }
        }
        return Math.max(positiveCount, negativeCount);
    }

    public static void main(String[] args) {
        int arr[] = new int[] { -2, -1, -1, 1, 2, 3 };
        System.out.println(maximumCount(arr));
    }
}
