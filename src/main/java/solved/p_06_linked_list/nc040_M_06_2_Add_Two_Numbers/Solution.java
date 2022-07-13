package solved.p_06_linked_list.nc040_M_06_2_Add_Two_Numbers;

import common.linked_list.lc_206_listnode.ListNode;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode prev = new ListNode(-1);
        ListNode result = prev;

        int flag = 0;

        while (l1 != null && l2 != null) {

            int currSum = l1.val + l2.val + flag;
            if (9 < currSum) {
                currSum = currSum - 10;
                flag = 1;
            } else {
                flag = 0;
            }
            prev.next = new ListNode(currSum);
            prev = prev.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        ListNode addPointer = null;
        if (l1 != null) addPointer = l1;
        else addPointer = l2;

        while (addPointer != null) {
            int currSum = addPointer.val + flag;
            if (9 < currSum) {
                currSum = currSum - 10;
                flag = 1;
            } else {
                flag = 0;
            }
            prev.next = new ListNode(currSum);
            prev = prev.next;

            addPointer = addPointer.next;
        }

        if (flag > 0) {
            prev.next = new ListNode(1);
        }
        return result.next;
    }
}
