package unsolved.p_07_trees.nc059_M_14_124_Binary_Tree_Maximum_Path_Sum;

import common.trees.lc_226_invert_tree.TreeNode;
import org.junit.Test;
import unsolved.p_07_trees.nc059_M_14_124_Binary_Tree_Maximum_Path_Sum.Solution;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        TreeNode n1r = new TreeNode(3);
        TreeNode n1l = new TreeNode(2);

        TreeNode n0 = new TreeNode(1, n1l, n1r);

        int actual = sut.maxPathSum(n0);

        int expected = 6;

        assertEquals(expected, actual);

    }

    @Test
    public void test_2() {

        TreeNode n1r = null;
        TreeNode n1l = new TreeNode(-1);

        TreeNode n0 = new TreeNode(2, n1l, n1r);

        int actual = sut.maxPathSum(n0);

        int expected = 2;

        assertEquals(expected, actual);

    }

    @Test
    public void test_3() {

        TreeNode n1r = null;
        TreeNode n1l = new TreeNode(2);

        TreeNode n0 = new TreeNode(-1, n1l, n1r);

        int actual = sut.maxPathSum(n0);

        int expected = 2;

        assertEquals(expected, actual);

    }

    @Test
    public void test_4() {

        TreeNode n1r = null;
        TreeNode n1l = new TreeNode(-1);

        TreeNode n0 = new TreeNode(-2, n1l, n1r);

        int actual = sut.maxPathSum(n0);

        int expected = -1;

        assertEquals(expected, actual);

    }


    @Test
    public void test_5() {

        TreeNode n1r = null;
        TreeNode n1l = new TreeNode(1);

        TreeNode n0 = new TreeNode(-2, n1l, n1r);

        int actual = sut.maxPathSum(n0);

        int expected = 1;

        assertEquals(expected, actual);

    }

}