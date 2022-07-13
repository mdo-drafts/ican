package solved.p_06_linked_list.nc035_E_01_206_Reverse_Linked_List;

import common.linked_list.lc_206_listnode.ListNode;

public class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode tmp = null;

        while (head != null) {

            ListNode next = head.next;
            head.next = tmp;
            tmp = head;
            head = next;
        }
        return tmp;
    }
}
