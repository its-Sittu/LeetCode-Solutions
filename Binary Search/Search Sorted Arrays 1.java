
// optimise Code






// points to remember......................................

// check kiya element mila ya nahi
// phir dekha kaunsa half sorted hai
// us sorted half me target aata hai ya nahi
// uske hisaab se search space half kar diya




class Solution {
    public int search(int[] nums, int target) {

        int low = 0, high = nums.length - 1;

        while (low <= high) {
            // left sorted
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
                //  right sorted
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

        }
        return -1;
    }
}
