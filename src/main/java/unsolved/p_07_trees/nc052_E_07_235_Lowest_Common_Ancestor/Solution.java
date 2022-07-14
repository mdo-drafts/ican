package unsolved.p_07_trees.nc052_E_07_235_Lowest_Common_Ancestor;

import common.trees.lc_226_invert_tree.TreeNode;

public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (q.val < root.val && p.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < q.val && root.val < p.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }
}
