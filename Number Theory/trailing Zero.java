class Solution {
    public static int trailingZeroes(int n) {
        // code here
        
        if( n == 0 || n == 1){
            return 0;
        }
        
        long ans = 1;
        int count = 0;
        
        
        int temp = n;
        
        while(temp != 1){
            ans = ans*temp;
            temp--;
        }
        
      while(ans > 0){
          
         long digit = ans % 10;
         
         if(digit == 0){
             count++;
         } else{
             break;
         }
         ans = ans/10;
         
      }
      return count;
    }
}
