//Brute Force
// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int maxlength = 0;
        
        for(int i =0; i<=arr.length-1; i++){
            int sum = 0;
            for(int j = i ; j<=arr.length-1; j++){
                sum = sum + arr[j];
                
                if(sum == k){
                    maxlength = Math.max(maxlength , j-i+1);
                }
            }
        }
        return maxlength;
    }
}

// 
