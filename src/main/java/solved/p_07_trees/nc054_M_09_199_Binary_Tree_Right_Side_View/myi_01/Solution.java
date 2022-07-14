package solved.p_07_trees.nc054_M_09_199_Binary_Tree_Right_Side_View.myi_01;

import common.trees.lc_226_invert_tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result, 0);
        return result;
    }

    private void traverse(TreeNode node, List<Integer> result, int level) {
        if (node == null) return;
        if(result.size() < level+1)result.add(node.val);
        //TODO: 'add' with index - will shift index and add an element if 'index' is occupied
        //TODO: 'set' replace data in 'index' if 'index' is occupied
        else result.set(level, node.val);
        traverse(node.left, result, level + 1);
        traverse(node.right, result, level + 1);
    }
}
