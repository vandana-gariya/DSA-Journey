//Leetocode 169: Majority Element
//Approach: Boyer–Moore Voting Algorithm 
//candidate: the current guess for the majority element
// count: how strong that guess is
//the majority element is strong enough to survive all cancellations

//Time Complexity: O(n)
//Space Complexity: O(1)

package Arrays;

public class MajorityElement {
    static int majorityElement(int []nums){
        int n=nums.length;
        int candidate=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(count==0){
                candidate =nums[i];
                count=1;
            }else if(nums[i]==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate ;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{2,2,1,1,1,2,2};
        int result=majorityElement(arr);
        System.out.println(result);
    }
}
