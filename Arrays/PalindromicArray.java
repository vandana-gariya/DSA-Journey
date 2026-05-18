package Arrays;

public class PalindromicArray {
    static boolean isPalindromic(int[] arr) {
        for (int num : arr) {
            if (!isPalindromicNumber(num)) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindromicNumber(int num) {
        int original = num;
        int reverse = 0;
        while (num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 111, 222, 333, 444, 556 };
        System.out.println(isPalindromic(arr));
    }
}
