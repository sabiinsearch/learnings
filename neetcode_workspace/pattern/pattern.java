class Solution {

        //  Lowercase Letter − a - z having ASCII values from 97 - 122 where, 97 and 122 are inclusive      
        
        public boolean checkPattern(String p) {
           for(int i=0;i<p.length();i++) {
               if(!(97<p[i]<122)) {
                  return false;
               }
           }
           return true;
        }

        public boolean checkWhitespace(String str)
        {
            if(str.charAt(0) == ' ' || str.charAt(str.length()-1) == ' ') {
               return false;
            }
            return true;
        } 
    public boolean storingPattern(String patt) {
//     char[patt.length] given;
       String given;
       for(int i=0;i<patt.size;i++) {
             if((given.indexOf(patt[i])==-1)) {
               given[i] = patt[i];
             }             
       }
  
    }

    public boolean wordPattern(String pattern, String s) {

        if((1 <= pattern.length <= 300) || (1 <= s.length <= 3000) || (checkPattern(pattern)) || (checkWhitespace(s))) {
            return false;
        }
        
        return true;
    }
}

public class pattern {
    public stati void main(String s[]) {
            
    }
}