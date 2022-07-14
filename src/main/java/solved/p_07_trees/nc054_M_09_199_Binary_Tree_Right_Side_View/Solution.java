package solved.p_07_trees.nc054_M_09_199_Binary_Tree_Right_Side_View;

import common.trees.lc_226_invert_tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        traverse(root, levels, 0);
        List<Integer> result = new ArrayList<>();
        for (List<Integer> list : levels) {
            result.add(list.get(list.size() - 1));
        }
        return result;
    }

    private void traverse(TreeNode node, List<List<Integer>> levels, int level) {
        if (node == null) return;
        if (levels.size() < level + 1) levels.add(new ArrayList<>());
        levels.get(level).add(node.val);
        traverse(node.left, levels, level + 1);
        traverse(node.right, levels, level + 1);
    }
}
