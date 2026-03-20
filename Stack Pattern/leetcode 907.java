// brute force code 

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int sum = 0, mod = (int) 1e9 + 7;
        int min;
        for (int i = 0; i < n; i++) {
            min = arr[i];

            for (int j = i; j < n; j++) {
                min = Math.min(min, arr[j]);
                sum = (sum + min) % mod;
            }
        }
        return sum;
    }
}

