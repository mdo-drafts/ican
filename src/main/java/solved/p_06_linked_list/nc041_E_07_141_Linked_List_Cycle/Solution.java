package solved.p_06_linked_list.nc041_E_07_141_Linked_List_Cycle;

import common.linked_list.lc_206_listnode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean hasCycle(ListNode head) {

        Set<ListNode> set = new HashSet<>();

        while(head!=null){
            if(set.contains(head)) return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
