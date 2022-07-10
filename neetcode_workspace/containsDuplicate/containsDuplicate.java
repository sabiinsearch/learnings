import java.util.*;

class Solution {

    public boolean containsDuplicate(int[] nums) {
         boolean reply = false;
         HashSet<Integer> check = new HashSet<Integer>();
         
         for(int i=0; i<nums.length;i++) {

             if(check.contains(nums[i])) {
                 System.out.println(Arrays.toString(check.toArray()));
                 return true;
             }
            
            check.add(nums[i]);                       
         }
         System.out.println(Arrays.toString(check.toArray())); 
         return false;
    }
}

public class containsDuplicate {

    public static void main(String args[]) {
        int[] test = {1,2,3,1};
        Solution teacher = new Solution();
        boolean reply = teacher.containsDuplicate(test);
        System.out.println(reply);
       }
}      