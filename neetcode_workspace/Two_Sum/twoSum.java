/**
      programme that print the indices of values in givnen int[] whose sum is equal to 
      the target given as parameter
      
*/
import java.util.HashMap;
import java.util.Arrays;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        
        for(int i = 0; i<nums.length;i++) {
             int diff = target - nums[i];
            if(prevMap.containsKey(diff)) {
                return new int[] {prevMap.get(diff),i};
            }
            prevMap.put(nums[i],i);
        }
         return new int[] {};
    }
}

public class twoSum {

    public static void main(String args[]) {
       Solution sol = new Solution();
       int[] quest = {2,3,4,5,6,7,8,9};
       System.out.println(Arrays.toString(sol.twoSum(quest,9)));
    }
}