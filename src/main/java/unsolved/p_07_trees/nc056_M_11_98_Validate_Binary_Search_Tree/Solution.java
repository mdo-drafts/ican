package unsolved.p_07_trees.nc056_M_11_98_Validate_Binary_Search_Tree;

import common.trees.lc_226_invert_tree.TreeNode;

public class Solution {

    public boolean isValidBST(TreeNode root) {
        return checkIfValid(root, null, null);
    }

    private boolean checkIfValid(TreeNode node, Integer low, Integer hight) {
        if (node == null) return true;

        if (low != null && node.val <= low) return false;
        if (hight != null && hight <= node.val) return false;

        return checkIfValid(node.left, low, node.val) &&
                checkIfValid(node.right, node.val, hight);
    }
}
