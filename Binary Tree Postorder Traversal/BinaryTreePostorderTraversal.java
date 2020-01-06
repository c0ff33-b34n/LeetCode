import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<Integer>();

        traversePostorder(root, output);

        return output;

    }

    public void traversePostorder (TreeNode node, List<Integer> output){

        if (node != null){
            traversePostorder (node.left, output);
            traversePostorder (node.right, output);
            output.add(node.val);
        }
    }
}