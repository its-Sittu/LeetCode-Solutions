
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max = 0;
        int n = s.length();

        for(int i = 0; i<n; i++){
            HashSet<Character> set = new HashSet<>();
              for(int j = i; j<n; j++){
                char c = s.charAt(j);

                if(set.contains(c)){
                    break;
                }

                set.add(c);
                max = Math.max(max , j-i+1);
              }
        }
        return max;
    }
}


--------------------------------------------------------------------------




    class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int max = 0;
        int i = 0, j = 0;
        HashSet<Character> set = new HashSet<>();

        while (j < n) {

            char c = s.charAt(j);

            while (set.contains(c)) {
                set.remove(s.charAt(i));
                i++;
            }

            set.add(c);
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }
}
