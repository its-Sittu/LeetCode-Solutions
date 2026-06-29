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
