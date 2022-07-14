package solved.p_07_trees.nc049_E_04_110_Balanced_Binary_Tree;

import common.trees.lc_226_invert_tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

        TreeNode n22r = new TreeNode(4);
        TreeNode n22l = new TreeNode(4);

        TreeNode n21r = new TreeNode(3, null, null);
        TreeNode n21l = new TreeNode(3, n22l, n22r);

        TreeNode n1r = new TreeNode(2, null, n21r);
        TreeNode n1l = new TreeNode(2, n21l, null);

        TreeNode n0 = new TreeNode(1, n1l, n1r);

        assertFalse(sut.isBalanced(n0));
    }

}