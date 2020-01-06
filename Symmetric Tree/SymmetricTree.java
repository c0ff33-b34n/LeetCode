public class SymmetricTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSymmetric(TreeNode root) {

        return checkSymmetrical(root, root);
    }

    private boolean checkSymmetrical(TreeNode n1, TreeNode n2){

        if (n1 == null && n2 == null) return true;
        if (n1 == null || n2 == null) return false;
        return ((n1.val == n2.val) && (checkSymmetrical(n1.left, n2.right)) && (checkSymmetrical(n1.right, n2.left)));
    }
	
}