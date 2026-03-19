// brute code 
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int rightm = 0;
        int leftm = 0;

        int[] prefixsum = new int[n];
        int[] suffixsum = new int[n];
// prefix sum
         prefixsum[0] = height[0];
       for(int i = 1; i<n; i++){
         prefixsum[i] = Math.max(prefixsum[i-1] , height[i]);
       }

// suffix sum
        suffixsum[n-1] = height[n-1];
     for(int i = n-2; i>=0; i--){
        suffixsum[i] = Math.max(suffixsum[i+1] , height[i]);
     }
   
   int water = 0;
    for(int i = 0; i<n; i++){ 
     leftm = prefixsum[i];
     rightm = suffixsum[i];
     water += Math.min(leftm , rightm) - height[i];
    }
    return water;
    }
}  // time complexcity o(3n) due to 3 loops 





// Stack (optimise Code)
// time complexcity O(n)
