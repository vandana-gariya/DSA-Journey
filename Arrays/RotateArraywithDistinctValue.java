//Leetcode: 33. Search in Rotated Sorted Array
//Appraoch: Binary search on rotated array with distinct values
// search in each sorted half of the array

//Time Complexity: O(logn)
//Space Complexity: O(1)

package Arrays;

public class RotateArraywithDistinctValue {
    static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[low] <= arr[mid]) {
                if (target <= arr[mid] && target >= arr[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target >= arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        int result=search(arr, 6);
        System.out.println(result);
    }
}
