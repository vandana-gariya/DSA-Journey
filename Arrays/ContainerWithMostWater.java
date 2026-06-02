//Leetcode 11:Container With Most water
//Approach: Two pointer
// move the pointer with smallest height because its limiting the area

//Time Complexity:O(n)
//Space Complexity:O(1)

package Arrays;

public class ContainerWithMostWater {
    static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int area = width * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(arr));
    }
}