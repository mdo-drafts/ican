package solved.p_06_linked_list.nc040_M_06_2_Add_Two_Numbers;

import common.linked_list.lc_206_listnode.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();


    @Test
    public void test_1() {

        ListNode n13 = new ListNode(3);
        ListNode n12 = new ListNode(4, n13);
        ListNode n11 = new ListNode(2, n12);


        ListNode n23 = new ListNode(4);
        ListNode n22 = new ListNode(6, n23);
        ListNode n21 = new ListNode(5, n22);

        ListNode res = sut.addTwoNumbers(n11, n21);

        ListNode en3 = new ListNode(8);
        ListNode en2 = new ListNode(0, en3);
        ListNode en1 = new ListNode(7, en2);

        while (en1 != null && res != null) {
            assertEquals(en1.val, res.val);
            en1 = en1.next;
            res = res.next;
        }
        assertTrue(en1 == null && res == null);
    }


    @Test
    public void test_2() {

        ListNode n11 = new ListNode(0);

        ListNode n21 = new ListNode(0);

        ListNode res = sut.addTwoNumbers(n11, n21);

        ListNode en1 = new ListNode(0);

        while (en1 != null && res != null) {
            assertEquals(en1.val, res.val);
            en1 = en1.next;
            res = res.next;
        }
        assertTrue(en1 == null && res == null);
    }


    @Test
    public void test_3() {

        ListNode n17 = new ListNode(9);
        ListNode n16 = new ListNode(9, n17);
        ListNode n15 = new ListNode(9, n16);
        ListNode n14 = new ListNode(9, n15);
        ListNode n13 = new ListNode(9, n14);
        ListNode n12 = new ListNode(9, n13);
        ListNode n11 = new ListNode(9, n12);


        ListNode n24 = new ListNode(9);
        ListNode n23 = new ListNode(9, n24);
        ListNode n22 = new ListNode(9, n23);
        ListNode n21 = new ListNode(9, n22);

        ListNode res = sut.addTwoNumbers(n11, n21);

        ListNode en8 = new ListNode(1);
        ListNode en7 = new ListNode(0, en8);
        ListNode en6 = new ListNode(0, en7);
        ListNode en5 = new ListNode(0, en6);
        ListNode en4 = new ListNode(9, en5);
        ListNode en3 = new ListNode(9, en4);
        ListNode en2 = new ListNode(9, en3);
        ListNode en1 = new ListNode(8, en2);

        while (en1 != null && res != null) {
            assertEquals(en1.val, res.val);
            en1 = en1.next;
            res = res.next;
        }
        assertTrue(en1 == null && res == null);
    }

}