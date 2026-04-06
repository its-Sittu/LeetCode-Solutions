// Optimse Code
// pehele first Occurence find Karo than Last 
// Based on Binary Search


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int high = n - 1;
        int low = 0;
        int first = -1;
        int last = -1;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (nums[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        high = n - 1;
        low = 0;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return new int[] { first, last };
    }
}
