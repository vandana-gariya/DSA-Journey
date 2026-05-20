//Leetcode: 81 Search in Rotated Sorted Array II
//Approach: Binary search on rotated array with duplicates
//arr[low] == arr[mid] == arr[high],shrink both ends (low++, high--) to determine the sorted half.
// search in each sorted half of the array

//Time Complexity: O(logn)
//Space Complexity: O(1)

package Arrays;

public class RotateArrayDuplicatesValue {
    static boolean search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (arr[low] == arr[mid] && arr[high] == arr[mid]) {
                low++;
                high--;
                continue;
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
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 5, 6, 0, 0, 1, 2 };
        System.out.println(search(arr, 0));
    }
}
