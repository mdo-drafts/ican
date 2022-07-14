package solved.p_07_trees.nc048_E_03_543_Diameter_of_Binary_Tree;

import common.trees.lc_226_invert_tree.TreeNode;

public class Solution {

    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        getDiameter(root);
        return max;
    }
    private int getDiameter(TreeNode node){
        if (node == null) return 0;
        int left = getDiameter(node.left);
        int right = getDiameter(node.right);
        max = Math.max(max, left + right);
        return 1 + Math.max(left, right);
    }
}
