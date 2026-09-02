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



// Optimise Solution


class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        
        HashSet<Integer> Set = new HashSet<>();

        for(int i = 0; i< Math.min(k , n); i++){
            if(Set.contains(nums[i])){
                return true;
            }

            Set.add(nums[i]);
        }

        for(int i = k; i< n; i++){
            if(Set.contains(nums[i])){
                return true;
            }
            Set.add(nums[i]);
            Set.remove(nums[i - k]);
        }

        return false;
    }
}
