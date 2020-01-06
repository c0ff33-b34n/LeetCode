public class BinaryTreeMaxDepth {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    public int maxDepth(TreeNode root) {

        int solution = 0;
        if (root == null){
            return solution;
        } else {
            solution = maximumDepth(root);
            return solution;
        }
    }

    private int maximumDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left_depth = maximumDepth(root.left);
        int right_depth = maximumDepth(root.right);
        return Math.max(left_depth, right_depth) + 1;

    }
}