
// Brute Force

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
     int n = s.length();

        HashSet<String> seen = new HashSet<>();
        HashSet<String> result = new HashSet<>();

      for(int i = 0; i<= n - 10; i++){
        String dna = s.substring(i , i + 10);

        if(seen.contains(dna)){
           result.add(dna);
        }

        seen.add(dna);
      }
      ArrayList<String> list = new ArrayList<String>(result);
      return list;
    }
}
