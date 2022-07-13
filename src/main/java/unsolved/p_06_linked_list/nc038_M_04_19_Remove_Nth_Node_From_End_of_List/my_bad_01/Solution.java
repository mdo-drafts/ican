package unsolved.p_06_linked_list.nc038_M_04_19_Remove_Nth_Node_From_End_of_List.my_bad_01;

import common.linked_list.lc_206_listnode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy = head;

        List<ListNode> nodes = new ArrayList<>();
        while (head != null) {
            nodes.add(head);
            head = head.next;
        }

        int delInd = nodes.size() - n;
        if (0 < delInd) {
            nodes.get(delInd - 1).next = nodes.get(delInd).next;
        } else {
            dummy = dummy.next;
        }

        return dummy;
    }

}
