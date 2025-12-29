//  in using slow fast pointer approch 
// beacuse not modify Array
//  not Extra Space , Time O(n)
//  same as find the cycle point of Linked List
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        while (true) {
            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];
            if (slow == fast) {
                break;
            }
        }
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
