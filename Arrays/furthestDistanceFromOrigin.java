//Leetcode: 2833 Farthest Distance From Origin
//Approach: we count the fixed position of L/R and count the underscore(_)
// try two best ending —make all _ go right (pos1) or all go left (pos2)
//Take the bigger of |pos1| and |pos2|

//Time Complexity: O(n)
//Space Complexity: O(1)

package Arrays;

public class furthestDistanceFromOrigin {
    static int FurthestDistanceFromOrigin(String moves) {
        int n = moves.length();
        int fixed = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (moves.charAt(i) == 'L') {
                fixed += -1;
            } else if (moves.charAt(i) == 'R') {
                fixed += 1;
            } else {
                k = k + 1;
            }
        }
        int pos1 = fixed + k;
        int pos2 = fixed - k;

        return Math.max(Math.abs(pos1), Math.abs(pos2));
    }

    public static void main(String[] args) {
        String str = "L_RL__R";
        int result = FurthestDistanceFromOrigin(str);
        System.out.println(result);
    }
}
