// Brute Code 



  class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        boolean isDig = false;

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i] == nums[j]){
                  if(Math.abs(i-j)<= k){
                      isDig = true;
                      break;
                  }
                }
            }
        }

        return isDig ;
    }
}
