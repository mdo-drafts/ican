package unsolved.p_07_trees.nc057_M_12_230_Kth_Smallest_Element_in_a_BST;

import common.trees.lc_226_invert_tree.TreeNode;

public class Solution {

    int count = 0;
    int result = Integer.MIN_VALUE;

    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return result;
    }

    public void traverse(TreeNode root, int k) {
        if(root == null) return;
        traverse(root.left, k);
        count ++;
        if(count == k) result = root.val;
        traverse(root.right, k);
    }
}
