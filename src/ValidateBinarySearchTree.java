/**
 * Created by mong on 1/8/17.
 */

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        else return helper(root, true) != null;
    }

    public static Integer helper(TreeNode root, boolean isFromLeft){
        Integer left = null, right = null;
        if(root.left != null){
            left = helper(root.left, true);
            if(left == null || root.val <= left) return null;
        }
        else if(root.right != null){
            right = helper(root.right, false);
            if(right == null || root.val >= right) return null;
        }
        if(isFromLeft){
            return right == null ? root.val : right;
        }
        else{
            return left == null? root.val : left;
        }
    }
}