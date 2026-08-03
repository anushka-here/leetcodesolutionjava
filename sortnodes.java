class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = prev.next.next;
            
            // Re-point links to swap nodes
            first.next = second.next;
            second.next = first;
            prev.next = second;
            
            // Move prev two steps ahead
            prev = first;
        }
        
        return dummy.next;
    }
}