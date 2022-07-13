package unsolved.p_06_linked_list.nc038_M_04_19_Remove_Nth_Node_From_End_of_List;

import common.linked_list.lc_206_listnode.ListNode;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;


        ListNode first = dummy;
        ListNode second = dummy;

        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        while(first != null){
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return dummy.next;

    }

}
