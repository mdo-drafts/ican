package unsolved.p_07_trees.nc057_M_12_230_Kth_Smallest_Element_in_a_BST;

import common.trees.lc_226_invert_tree.TreeNode;
import org.junit.Test;
import unsolved.p_07_trees.nc057_M_12_230_Kth_Smallest_Element_in_a_BST.Solution;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {


        TreeNode n21r = new TreeNode(2);
        TreeNode n21l = null;

        TreeNode n1r = new TreeNode(4);
        TreeNode n1l = new TreeNode(1, n21l, n21r);

        TreeNode n0 = new TreeNode(3, n1l, n1r);

        int k = 1;

        int actual = sut.kthSmallest(n0, k);

        int expected = 1;

        assertEquals(expected, actual);

    }

}