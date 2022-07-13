package solved.p_06_linked_list.nc036_E_02_21_Merge_Two_Sorted_Lists;

import common.linked_list.lc_206_listnode.ListNode;

public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        if (list1 != null) head.next = list1;
        if (list2 != null) head.next = list2;

        return dummy.next;
    }
}
