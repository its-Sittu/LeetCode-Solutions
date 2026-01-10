class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        return prefixSum;
    }
}



// Prefix = running sum
// Prefix = ka bhi ek dummy array banooo
// Abb prefixSum ka or first elements too fix hi rhega na kyu ki wahi se adding start ho rhi hai 
// First index alag
// prefixSum[i] = prefixSum[i - 1] + nums[i];
// isme har ek index pr sum value store ho rha hai ...0 ka already hmne kr diyaa thaa 
// Array return
