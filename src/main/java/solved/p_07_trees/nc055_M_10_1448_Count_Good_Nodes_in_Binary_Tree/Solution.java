package solved.p_07_trees.nc055_M_10_1448_Count_Good_Nodes_in_Binary_Tree;

import common.trees.lc_226_invert_tree.TreeNode;

public class Solution {

    int count = 0;

    public int goodNodes(TreeNode root) {
        traverse(root, root.val);
        return count;
    }
    private void traverse(TreeNode node, int currMax) {
        if(node == null) return;
        if(currMax <= node.val) count++;
        currMax = Math.max(currMax, node.val);
        traverse(node.left, currMax);
        traverse(node.right, currMax);
    }
}
