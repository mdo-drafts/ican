package solved.p_06_linked_list.nc041_E_07_141_Linked_List_Cycle.my_bad_01;

import common.linked_list.lc_206_listnode.ListNode;

public class Solution {

    public boolean hasCycle(ListNode head) {

        if (head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;
        while (slow != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) return true;
        }
        return false;
    }
}
