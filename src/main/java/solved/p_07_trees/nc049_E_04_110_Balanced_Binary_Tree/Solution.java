package solved.p_07_trees.nc049_E_04_110_Balanced_Binary_Tree;

import common.trees.lc_226_invert_tree.TreeNode;

public class Solution {

    boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        checkIfBalanced(root);
        return isBalanced;
    }

    private int checkIfBalanced(TreeNode node) {
        if (node == null) return 0;

        int left = checkIfBalanced(node.left);
        int right = checkIfBalanced(node.right);
        if (1 < Math.abs(right - left)) isBalanced = false;
        return 1 + Math.max(left, right);
    }
}
