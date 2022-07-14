package solved.p_07_trees.nc050_E_05_100_Same_Tree;

import common.trees.lc_226_invert_tree.TreeNode;

public class Solution {

    public boolean isSameTree(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;
        if (node1.val != node2.val) return false;
        return isSameTree(node1.left, node2.left) && isSameTree(node1.right, node2.right);
    }
}
