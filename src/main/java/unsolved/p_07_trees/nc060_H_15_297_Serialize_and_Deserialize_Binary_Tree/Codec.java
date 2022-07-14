package unsolved.p_07_trees.nc060_H_15_297_Serialize_and_Deserialize_Binary_Tree;

import common.trees.lc_226_invert_tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Codec {

    int i = 0;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> result = new ArrayList<>();
        sDFS(root, result);
        return String.join(",", result);
    }

    private void sDFS(TreeNode node, List<String> result) {
        if (node == null) {
            result.add("N");
            return;
        }
        result.add(String.valueOf(node.val));
        sDFS(node.left, result);
        sDFS(node.right, result);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] values = data.split(",");
        return dDFS(values);
    }

    private TreeNode dDFS(String[] values) {
        if (Objects.equals(values[i], "N")) {
            i++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(values[i]));
        i++;
        node.left = dDFS(values);
        node.right = dDFS(values);
        return node;
    }
}
