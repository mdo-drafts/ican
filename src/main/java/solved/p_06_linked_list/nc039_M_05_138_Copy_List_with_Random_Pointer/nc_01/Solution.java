package solved.p_06_linked_list.nc039_M_05_138_Copy_List_with_Random_Pointer.nc_01;

import common.linked_list.lc_138_random_pointer.Node;

import java.util.HashMap;

public class Solution {

    public Node copyRandomList(Node head) {
        Node cur = head;
        HashMap<Node, Node> map = new HashMap<>();
        while (cur!=null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while (cur!=null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}
