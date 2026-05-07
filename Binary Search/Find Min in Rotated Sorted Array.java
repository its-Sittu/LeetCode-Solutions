class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int height = nums.length - 1;

        int ans = Integer.MAX_VALUE;

        while (low <= height) {
            int mid = (low + height) / 2;
            //left part check 

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= ans) {
                    ans = Math.min(ans, nums[low]);
                }
                low = mid + 1;
            } else {

                if (nums[mid] <= ans) {
                    ans = Math.min(ans, nums[mid]);
                }
                height = mid - 1;
            }

        }
        return ans;
    }
}




// REVISION ..................................................................................................

Array: [4, 5, 6, 7, 0, 1, 2]
Step 1:  low=0, high=6, mid=3
         nums[low]=4, nums[mid]=7
         4 <= 7  →  LEFT SORTED
         ans = min(MAX, 4) = 4
         low = 4

Step 2:  low=4, high=6, mid=5
         nums[low]=0, nums[mid]=1
         0 <= 1  →  LEFT SORTED
         ans = min(4, 0) = 0
         low = 6

Step 3:  low=6, high=6, mid=6
         nums[low]=2, nums[mid]=2
         2 <= 2  →  LEFT SORTED
         ans = min(0, 2) = 0
         low = 7

Loop ends → Return 0 ✅
