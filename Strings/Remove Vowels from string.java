// Brute force approach

String ans = " ";

for(-------------){
  char ch = s.charAt(i);
  // mtlb uss string ke  andar ka elements

  if(ch !="a" && -------------------){
    // Similarly for all vowels 

    ans = ans + ch;
  }
}
return ans;
}





// Optimise Code using StringBuilder 

class Solution {
    String removeVowels(String s) {
        // code here
       StringBuilder ans = new StringBuilder();
       
       
       for(int i =0; i<s.length(); i++){
           char ch = s.charAt(i);
           
           if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o'
           && ch != 'u'){
               ans.append(ch);
           }
       }
       return ans.toString();
    }
}
