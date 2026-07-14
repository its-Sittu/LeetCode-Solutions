// optimise code 

class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        int n = str1.length();
        int m = str2.length();
        
        int [] freq = new int[26];

        
        for(int i = 0; i<m; i++){
            freq[str2.charAt(i)-'a'] = 1;
        }
        
        StringBuilder ans = new StringBuilder();
        
        for(int i = 0; i<n; i++){
            char ch = str1.charAt(i);
            
           if( freq[ch - 'a'] == 0){
             ans.append(ch);
           }
        }
        
        return ans.toString();
    }
}
