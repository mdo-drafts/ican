package solved.p_07_trees.nc054_M_09_199_Binary_Tree_Right_Side_View.myi_01;

import common.trees.lc_226_invert_tree.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static util.Collections.asList;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

        TreeNode n22r = new TreeNode(4);
        TreeNode n21r = new TreeNode(5);

        TreeNode n1r = new TreeNode(3, null, n22r);
        TreeNode n1l = new TreeNode(2, null, n21r);

        TreeNode n0 = new TreeNode(1, n1l, n1r);


        List<Integer> actual = sut.rightSideView(n0);

        List<Integer> expected = asList(1,3,4);
        assertEquals(expected, actual);
    }

}