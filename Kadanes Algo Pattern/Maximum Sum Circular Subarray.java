// 1️⃣ Two cases:
// Circular subarray = totalSum − minSubarray



// 2️⃣ Kadane twice:
// res → maximum subarray sum
// res1 → minimum subarray sum



// 3️⃣ Final answer:
// max(res, totalSum - res1)


// 4️⃣ All negative case ❗
// Agar res < 0, directly res return karo


// 5️⃣ Efficiency:
// Time O(n)
// Space O(1)

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int minSum = nums[0];
        int res = nums[0];
        int res1 = nums[0];
        int totalSum = nums[0];

        for (int i = 1; i < n; i++) {

            maxSum = Math.max(maxSum + nums[i], nums[i]);
            res = Math.max(maxSum, res);

            minSum = Math.min(minSum + nums[i], nums[i]);
            res1 = Math.min(minSum, res1);

            totalSum += nums[i];

        }
        if (res < 0)
            return res;
        return Math.max(res, totalSum - res1);
    }
}
