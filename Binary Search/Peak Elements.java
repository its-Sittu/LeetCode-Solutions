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


// Binary Search 

class Solution {
    public int findPeakElement(int[] nums) {
        

        int low = 0;
        int high = nums.length-1;

        while(low < high){
            int mid = (low + high ) / 2;

            if(nums[mid] > nums[mid+1]){
                high = mid;
            } else{
                low = mid + 1;
            }
        }
        return low;
    }
}
