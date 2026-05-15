package Arrays;
//Leetcode-27 remove Element
//Approach - two pointer 
// Traverse the array
//Store valid elements at index k.
// Increment k whenever element != val.

//Time complexity-O(n)
//Space Complexity -O(1)

public class RemoveElement {

    static int removeElement(int[] arr, int val) {
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != val) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
        int result = removeElement(arr, 2);
        System.out.println("k: " + result);
    }
}