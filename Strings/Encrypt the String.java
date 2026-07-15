// optimise code 

class Solution {
    String encryptString(String s) {
        // code here
        int n = s.length();
        int i = 0;
        StringBuilder ans = new StringBuilder();
        
       while(i<n){
          int count = 1;
          char ch = s.charAt(i);
          
          while(i+1<n && s.charAt(i) == s.charAt(i+1)){
              count++;
              i++;
          }
          ans.append(ch);
          ans.append(count);
          i++;
       }
       ans.reverse();
       return ans.toString();
    }
}
