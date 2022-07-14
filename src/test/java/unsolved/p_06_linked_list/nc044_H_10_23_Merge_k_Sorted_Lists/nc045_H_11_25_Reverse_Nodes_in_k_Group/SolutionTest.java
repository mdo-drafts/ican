package unsolved.p_06_linked_list.nc044_H_10_23_Merge_k_Sorted_Lists.nc045_H_11_25_Reverse_Nodes_in_k_Group;

import common.linked_list.lc_206_listnode.ListNode;
import org.junit.Test;
import unsolved.p_06_linked_list.nc045_H_11_25_Reverse_Nodes_in_k_Group.Solution;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){


        ListNode n15 = new ListNode(5);
        ListNode n14 = new ListNode(4, n15);
        ListNode n13 = new ListNode(3, n14);
        ListNode n12 = new ListNode(2, n13);
        ListNode n11 = new ListNode(1, n12);

        ListNode res = sut.reverseKGroup(n11, 2);


        ListNode en5 = new ListNode(5);
        ListNode en4 = new ListNode(3, en5);
        ListNode en3 = new ListNode(4, en4);
        ListNode en2 = new ListNode(1, en3);
        ListNode en1 = new ListNode(2, en2);

        while (en1 != null && res != null) {
            assertEquals(en1.val, res.val);
            en1 = en1.next;
            res = res.next;
        }
        assertTrue(en1 == null && res == null);

    }

}