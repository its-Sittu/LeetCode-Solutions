

class Solution {
    String removeDuplicates(String s) {
        
        Set<Character> seen = new HashSet<>();
        StringBuilder res = new StringBuilder();
        int n = s.length();
        for(int i =0; i<n; i++){
            char ch = s.charAt(i);
            if(!seen.contains(ch)){
                seen.add(ch);
                   res.append(ch);
          }
    }
    return res.toString();
}
}
