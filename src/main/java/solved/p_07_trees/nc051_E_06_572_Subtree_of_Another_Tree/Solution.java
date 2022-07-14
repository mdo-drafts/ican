package solved.p_07_trees.nc051_E_06_572_Subtree_of_Another_Tree;

import common.trees.lc_226_invert_tree.TreeNode;

public class Solution {

    boolean isSubtree = false;

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        checkIfTheSame(root, subRoot);
        return isSubtree;
    }

    private void checkIfTheSame(TreeNode root, TreeNode subRoot) {
        if (root == null || subRoot == null) return;
        if (root.val == subRoot.val) {
            if (isTheSameTree(root, subRoot)) isSubtree = true;
        }
        checkIfTheSame(root.left, subRoot);
        checkIfTheSame(root.right, subRoot);
    }

    private boolean isTheSameTree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;
        if (root == null || subRoot == null) return false;
        if (root.val != subRoot.val) return false;
        return isTheSameTree(root.left, subRoot.left) && isTheSameTree(root.right, subRoot.right);
    }
}
