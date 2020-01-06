import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> output = new ArrayList<Integer>();

        traverseInOrder(root, output);

        return output;


    }

    public void traverseInOrder (TreeNode node, List<Integer> output){

        if (node != null){
            traverseInOrder (node.left, output);
            output.add(node.val);
            traverseInOrder (node.right, output);
        }

    }
}