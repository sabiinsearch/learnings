import java.util.HashMap;

class Solution {

    public boolean isAnagram(String s, String t) {

        boolean reply = false;
        
        if(s.length()==t.length()) {

            HashMap<Character,Integer> hm1,hm2;
            hm1 = new HashMap<>();
            hm2 = new HashMap<>();
            
            for(int i=0;i<s.length();i++) {

               // put values in hm1
               if(hm1.containsKey(s.charAt(i))) {
                       hm1.put(s.charAt(i), hm1.get(s.charAt(i))+1);
               }
               else {
                  hm1.put(s.charAt(i), 1);
               }

               // put values in hm2
               if(hm2.containsKey(t.charAt(i))) {
                       hm2.put(t.charAt(i), hm2.get(t.charAt(i))+1);
               }
               else {
                  hm2.put(t.charAt(i), 1);
               }
            }

            if(hm1.equals(hm2)) {
                   reply = true;
            }
        }
        return reply;
    }  
 
        

   public int count_occurences(String str, char c) {

     int count = 0;
 
     for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) == c) {
            count++;
         }
     }
    
    return count;
   }    
}

public class anagram {


    public static void main(String args[]) {
    String s = "car";
    String t = "rac";

    Solution solution = new Solution();

    System.out.println(solution.isAnagram(s,t));

    }
}