// Leetcode 229: Majority Element II
//Approach: Boyer–Moore algo
//we have atmost 2 candidate.
//First pass: find up to two potential candidates (cand1, cand2) by using “cancellation(cancel out non majority element)
//Second pass:verify the real frequency of those candidates, and keep only those with count >⌊𝑛/3⌋

//Time → O(n)
// Space → O(1)

package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement_2 {
    static List<Integer> majorityElement(int[] nums){
        int n=nums.length;
        int count1=0, count2=0;
        int candidate1=0, candidate2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==candidate1){
                count1++;
            }else if(nums[i]==candidate2){
                count2++;
            }else if(count1==0){
                candidate1=nums[i];
                count1=1;
            }else if(count2==0){
                candidate2=nums[i];
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for (int num : nums) {
            if(num==candidate1){
                count1++;
            }else if(num==candidate2){
                count2++;
            }
        }
        List<Integer>list=new ArrayList<>();
        if(count1>n/3){
            list.add(candidate1);
        }else if(count2>n/3){
            list.add(candidate2);
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{3,2,3};
        System.out.println(majorityElement(arr));
    }
}
