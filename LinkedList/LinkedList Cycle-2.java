public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next; 
   //   Check LL is Cycle or Not in phase 1
            if (slow == fast) {
                break;
            }
        }

        //  IMPORTANT CHECK 
        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
//  slow at head after phase 1
      
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
}
