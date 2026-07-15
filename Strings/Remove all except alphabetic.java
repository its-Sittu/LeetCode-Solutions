// optimise code 

class Solution {
    public String removeChars(String s) {
        // code here
        int n = s.length();
        
        StringBuilder ans = new StringBuilder();
        
        
        for(int i =0; i<n ; i++){
            char ch = s.charAt(i);
            
            if(ch >='a' && ch <='z' ){
                ans.append(ch);
            } else if( ch >='A' && ch <='Z'){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
};
