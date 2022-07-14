package unsolved.p_07_trees.nc058_M_13_105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal;

import common.trees.lc_226_invert_tree.TreeNode;

import java.util.Arrays;

public class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        int rootIndex = getRootIndex(root.val, inorder);
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, rootIndex + 1), Arrays.copyOfRange(inorder, 0, rootIndex));
        root.right = buildTree(Arrays.copyOfRange(preorder, rootIndex + 1, preorder.length), Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length));
        return root;
    }

    private int getRootIndex(int val, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == val) return i;
        }
        return -1;
    }


}
