import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

   public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> output = new ArrayList<Integer>();

        traversePreOrder(root, output);

        return output;

    }

    public void traversePreOrder (TreeNode node, List<Integer> output){

        if (node != null){
            output.add(node.val);
            traversePreOrder (node.left, output);
            traversePreOrder (node.right, output);
        }
    }
}