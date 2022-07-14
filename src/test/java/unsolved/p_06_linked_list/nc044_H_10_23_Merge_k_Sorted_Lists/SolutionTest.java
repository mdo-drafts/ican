package unsolved.p_06_linked_list.nc044_H_10_23_Merge_k_Sorted_Lists;

import common.linked_list.lc_206_listnode.ListNode;
import org.junit.Test;
import solved.p_06_linked_list.nc044_H_10_23_Merge_k_Sorted_Lists.Solution;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){


        ListNode n13 = new ListNode(5);
        ListNode n12 = new ListNode(4, n13);
        ListNode n11 = new ListNode(1, n12);


        ListNode n23 = new ListNode(4);
        ListNode n22 = new ListNode(3, n23);
        ListNode n21 = new ListNode(1, n22);

        ListNode n32 = new ListNode(6);
        ListNode n31 = new ListNode(2, n32);


        ListNode[] lists = {n11, n21, n31};

        ListNode res = sut.mergeKLists(lists);


        ListNode en8 = new ListNode(6);
        ListNode en7 = new ListNode(5, en8);
        ListNode en6 = new ListNode(4, en7);
        ListNode en5 = new ListNode(4, en6);
        ListNode en4 = new ListNode(3, en5);
        ListNode en3 = new ListNode(2, en4);
        ListNode en2 = new ListNode(1, en3);
        ListNode en1 = new ListNode(1, en2);

        while (en1 != null && res != null) {
            assertEquals(en1.val, res.val);
            en1 = en1.next;
            res = res.next;
        }
        assertTrue(en1 == null && res == null);

    }

}