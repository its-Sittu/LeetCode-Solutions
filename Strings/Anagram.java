// Frequency 

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        // Frequency
        
        if(s1.length() != s2.length()){
            return false;
        }
        
        int [] freq = new int[26];
        
        for(int i = 0; i<s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        
        for(int count: freq){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}



// HashMap Optimise code

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()){
            return false;
        }
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char ch : s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(char ch : s2.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }
            
            map.put(ch,map.get(ch)-1);
            
            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }
}
