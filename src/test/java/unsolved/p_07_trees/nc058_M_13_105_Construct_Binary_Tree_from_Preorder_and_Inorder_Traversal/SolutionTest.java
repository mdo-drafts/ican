package unsolved.p_07_trees.nc058_M_13_105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal;

import common.trees.lc_226_invert_tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode root = sut.buildTree(preorder, inorder);

        assertEquals(3, root.val);
    }

}