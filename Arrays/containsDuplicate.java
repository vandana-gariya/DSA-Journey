//Leetocde: 217 Contains Duplicate
//Approach: HashSet
//Time Complexity-> O(n)
//space complexity->0(n)


package Arrays;

import java.util.HashSet;
public class containsDuplicate {
    static boolean ContainsDuplicate(int []nums){
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
           if(set.contains(num)){
            return true;
           }
           set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]=new int[]{1,1,1,3,3,4,3,2,4,2};
        ContainsDuplicate(nums);
    }
}
