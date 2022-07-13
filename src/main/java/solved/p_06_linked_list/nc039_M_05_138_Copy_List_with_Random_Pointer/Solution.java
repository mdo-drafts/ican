package solved.p_06_linked_list.nc039_M_05_138_Copy_List_with_Random_Pointer;

import common.linked_list.lc_138_random_pointer.Node;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Node copyRandomList(Node head) {

        Map<Node, Node> nodeMap = new HashMap<>();

        Node copyHead = null;
        Node pointer = head;

        while (pointer != null) {
            Node copy = new Node(pointer.val);
            if (copyHead == null) {
                copyHead = copy;
            }
            nodeMap.put(pointer, copy);
            pointer = pointer.next;
        }

        pointer = head;
        Node pointer2 = copyHead;
        while (pointer != null) {
            pointer2.next = nodeMap.get(pointer.next);
            pointer2.random = nodeMap.get(pointer.random);
            pointer2 = pointer2.next;
            pointer = pointer.next;
        }

        return copyHead;
    }
}
