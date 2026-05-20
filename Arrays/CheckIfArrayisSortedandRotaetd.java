// Leetcode: 1752. Check if Array Is Sorted and Rotated
//Approach: in a sorted rotated array there will be only one element smaller then all
// so for sorted rotated array the drop value will be less then 1

//Time Complexity: O(n)
//Space Compplexity: O(1)

package Arrays;

public class CheckIfArrayisSortedandRotaetd {
    static boolean check(int arr[]) {
        int n = arr.length;
        int drop = 0;
        if (n <= 1) {
            return true;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                drop++;
                if (drop > 1)
                    return false;
            }
        }
        if (arr[0] < arr[n - 1]) {
            drop++;
        }
        return drop <= 1;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 3, 4, 5, 1, 2 };
        boolean result = check(arr);
        System.out.println(result);
    }
}
