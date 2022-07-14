package unsolved.p_07_trees.nc056_M_11_98_Validate_Binary_Search_Tree;

import common.trees.lc_226_invert_tree.TreeNode;
import org.junit.Test;
import unsolved.p_07_trees.nc056_M_11_98_Validate_Binary_Search_Tree.Solution;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        TreeNode n1r = new TreeNode(3);
        TreeNode n1l = new TreeNode(1);

        TreeNode n0 = new TreeNode(2, n1l, n1r);

        assertTrue(sut.isValidBST(n0));
    }
    @Test
    public void test_2(){

        TreeNode n22r = new TreeNode(7);
        TreeNode n22l = new TreeNode(3);

        TreeNode n1r = new TreeNode(6, n22l, n22r);
        TreeNode n1l = new TreeNode(4);

        TreeNode n0 = new TreeNode(5, n1l, n1r);

        assertFalse(sut.isValidBST(n0));
    }


    @Test
    public void test_3(){

        TreeNode n22r = new TreeNode(6);
        TreeNode n22l = new TreeNode(4);

        TreeNode n21r = new TreeNode(2);
        TreeNode n21l = new TreeNode(0);


        TreeNode n1r = new TreeNode(5, n22l, n22r);
        TreeNode n1l = new TreeNode(1, n21l, n21r);

        TreeNode n0 = new TreeNode(3, n1l, n1r);

        assertTrue(sut.isValidBST(n0));
    }

    @Test
    public void test_4(){
        TreeNode n1r = new TreeNode(2);
        TreeNode n1l = new TreeNode(2);

        TreeNode n0 = new TreeNode(2, n1l, n1r);

        assertFalse(sut.isValidBST(n0));
    }

    @Test
    public void test_5(){
        TreeNode n1r = new TreeNode(-1);
        TreeNode n1l = null;

        TreeNode n0 = new TreeNode(2, n1l, n1r);

        assertFalse(sut.isValidBST(n0));
    }
}