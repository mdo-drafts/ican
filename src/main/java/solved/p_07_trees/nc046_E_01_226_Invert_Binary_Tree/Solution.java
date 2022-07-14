package solved.p_07_trees.nc046_E_01_226_Invert_Binary_Tree;

import common.trees.lc_226_invert_tree.TreeNode;

public class Solution {

    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private void invert(TreeNode node) {
        if (node == null) return;
        TreeNode tmp;
        tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        invert(node.left);
        invert(node.right);
    }
}
