class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        ListNode slow = head;

        if (fast == null) {
            return head.next;
        }
        // agar fast null ho gaya
        // matlab delete karna head ko hai
      
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // fast aur slow dono ko saath chalao
        // jab tak fast last node pe na pahunch jaye
        slow.next = slow.next.next;

        return head;
    }
}
