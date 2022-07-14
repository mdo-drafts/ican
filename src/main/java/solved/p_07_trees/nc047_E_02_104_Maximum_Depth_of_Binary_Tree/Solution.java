package solved.p_07_trees.nc047_E_02_104_Maximum_Depth_of_Binary_Tree;

import common.trees.lc_226_invert_tree.TreeNode;

public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
