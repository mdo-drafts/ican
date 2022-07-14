package solved.p_06_linked_list.nc044_H_10_23_Merge_k_Sorted_Lists;

import common.linked_list.lc_206_listnode.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        Map<Integer, ListNode> map = new HashMap<>();
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) map.put(i, lists[i]);
        }

        while (0 < map.size()) {
            ListNode min = new ListNode(Integer.MAX_VALUE);
            int minKey = Integer.MAX_VALUE;
            for (Map.Entry<Integer, ListNode> entry : map.entrySet()) {
                if (entry.getValue().val < min.val) {
                    min = entry.getValue();
                    minKey = entry.getKey();
                }
            }

            head.next = min;
            head = head.next;
            if (min.next == null) map.remove(minKey);
            else map.put(minKey, min.next);
        }

        return dummy.next;
    }
}
