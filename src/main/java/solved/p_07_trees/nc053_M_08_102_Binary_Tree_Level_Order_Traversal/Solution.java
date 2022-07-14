package solved.p_07_trees.nc053_M_08_102_Binary_Tree_Level_Order_Traversal;

import common.linked_list.lc_206_listnode.ListNode;
import common.trees.lc_226_invert_tree.TreeNode;

import java.util.*;
import java.util.List;

public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        traverse(root, result, 0);
        return result;
    }
    private void traverse(TreeNode node, List<List<Integer>> result, int level) {
        if(node == null) return;
        if(result.size() < level+1 ) result.add(new ArrayList<>());
        result.get(level).add(node.val);
        traverse(node.left, result, level+1);
        traverse(node.right, result, level+1);
    }
}

