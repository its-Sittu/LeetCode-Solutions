// Brute force

class Solution {
	public int maxSubarraySum(int[] arr, int k) {
		// Code here
		int n = arr.length;
		
		int Maxsum = Integer.MIN_VALUE;
		
		for (int i = 0; i <= n - k; i++) {
			int sum = 0;
			
			for (int j = i; j<i + k; j++) {
				
				sum += arr[j];
			}
			Maxsum = Math.max(Maxsum, sum);
		}
		return Maxsum;
	}
}





// Optimise Solution

class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int sum =0;
        
        // first window
        for(int i = 0; i<k; i++){
            sum += arr[i];
        }
        
        int maxsum = sum;
        
        // next windows
        for(int j = k; j<n; j++){
            sum = sum - arr[j-k] + arr[j];
            maxsum = Math.max(maxsum , sum);
        }
        return maxsum;
        
    }
}
