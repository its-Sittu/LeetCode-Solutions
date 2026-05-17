// brute force code 

class Solution {
    public int findPeakElement(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            boolean leftpart = (i == 0) || (nums[i] > nums[i - 1]);
            boolean rightpart = (i == n - 1) || (nums[i] > nums[i + 1]);

            if (leftpart && rightpart) {
                return i;
            }
        }
        return -1;
    }
}
