package unsolved.p_06_linked_list.nc045_H_11_25_Reverse_Nodes_in_k_Group;

import common.linked_list.lc_206_listnode.ListNode;

public class Solution {


    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(-1, head);

        ListNode groupPrev = dummy;

        while (true) {
            ListNode kTh = getKth(groupPrev, k);
            if (kTh == null) break;

            ListNode groupNext = kTh.next;

            ListNode prev = kTh.next;
            ListNode curr = groupPrev.next;

            while (curr != groupNext) {

                ListNode tmp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tmp;
            }

            ListNode tmp2 = groupPrev.next;
            groupPrev.next = kTh;
            groupPrev = tmp2;

        }
        return dummy.next;
    }

    private ListNode getKth(ListNode curr, int k) {
        while (curr != null && 0 < k) {
            curr = curr.next;
            k--;
        }
        return curr;
    }
}
