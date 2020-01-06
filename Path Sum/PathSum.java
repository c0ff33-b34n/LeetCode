public class PathSum {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean hasPathSum(TreeNode root, int sum) {

        if (root == null) return false;

        return pathSum(root, sum, 0);

    }

    private boolean pathSum(TreeNode node, int sum, int runningTotal){

        if (node == null){
            return false;
        }

        if (node.left == null && node.right == null && ((runningTotal + node.val) == sum)) return true;


        if (pathSum(node.left, sum, runningTotal + node.val) == true || pathSum(node.right, sum, runningTotal + node.val) == true) return true;

        return false;

    }
}