// brute Code 

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long max = 0;

        for (int i = 0; i <= n - k; i++) {
            HashSet<Integer> set = new HashSet<>();
            boolean isDup = false;

            long sum = 0;

            for (int j = i; j <= i + k - 1; j++) {
                if (set.contains(nums[j])) {
                    isDup = true;
                    break;
                }

                set.add(nums[j]);
                sum = sum + nums[j];
            }

            if (!isDup) {
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}


// Revision 
i = window ko move karta hai
j = current window ke elements ko traverse karta hai
set = duplicate check karta hai
sum = current window ka sum
max = ab tak ka maximum valid window sum



