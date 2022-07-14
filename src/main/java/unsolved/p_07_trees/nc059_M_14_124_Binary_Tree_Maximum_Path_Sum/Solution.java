package unsolved.p_07_trees.nc059_M_14_124_Binary_Tree_Maximum_Path_Sum;

import common.trees.lc_226_invert_tree.TreeNode;

public class Solution {

    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        calculateMaxPathSum(root);
        return max;
    }

    private int calculateMaxPathSum(TreeNode node) {
        if (node == null) return 0;

        int leftMax = Math.max(calculateMaxPathSum(node.left), 0);
        int rightMax = Math.max(calculateMaxPathSum(node.right), 0);
        int currSum = node.val + leftMax + rightMax;

        max = Math.max(max, currSum);
        return node.val + Math.max(leftMax, rightMax);
    }
}
