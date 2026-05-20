// Leetcode:26 Remove Duplicates from Sorted Array

//Time complexity: O(n)
//Space Complexity: O(n)

package Arrays;

public class RemoveDuplicateFromSortedArray {
    static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (arr == null || arr.length == 0)
            return 0;
        int k = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(arr));
    }
}
