//Leetcode 344: Reverse String
//Approach:two pointer and swapping
//Time Complexity:O(n)
//Space Complexity:O(1)

package Strings;

public class ReverseString {
    static void reverseString(char[] c) {
        int start = 0;
        int end = c.length - 1;
        while (start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
    }
}