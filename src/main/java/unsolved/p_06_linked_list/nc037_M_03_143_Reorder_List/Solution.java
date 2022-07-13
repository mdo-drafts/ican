package unsolved.p_06_linked_list.nc037_M_03_143_Reorder_List;

import common.linked_list.lc_206_listnode.ListNode;

public class Solution {

    public void reorderList(ListNode head) {

        ListNode slow = head;
        ListNode fast = head.next;
        //TODO: remember algorithm to find the middle of the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;

        ListNode tmp = null;
        while (second != null) {
            ListNode next = second.next;
            second.next = tmp;
            tmp = second;
            second = next;
        }

        ListNode first = head;
        second = tmp;
        //Second is shorted or equal to first, we do not need to compare both second && first
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;

            first.next = second;
            second.next = tmp1;

            first = tmp1;
            second = tmp2;
        }
    }
}
