// Yhaa pr hame min Subarray and max Subarray find krna hai pehle than use absolute krne ke baad max kr dena hai ans aa jayega ...

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int minSum = nums[0];
        int maxSum = nums[0];
        int minAns = nums[0];
        int maxAns = nums[0];
        // int finalans =0;
        for(int i=1; i<n; i++){
            
            maxSum = Math.max(nums[i] , maxSum +nums[i]);
            maxAns = Math.max(maxSum , maxAns);

            minSum = Math.min(nums[i] ,minSum +nums[i]);
            minAns = Math.min(minSum , minAns);

        }
        return  Math.max(Math.abs(maxAns), Math.abs(minAns));
    }
}
