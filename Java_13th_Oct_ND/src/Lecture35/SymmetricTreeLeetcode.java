package Lecture35;

import Lecture35.DiameterLeetcode.TreeNode;

public class SymmetricTreeLeetcode {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public boolean isSymmetric(TreeNode root) {
		return sym(root.left, root.right);
	}

	private boolean sym(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		if(root1 == null && root2 == null) {
			return true;
		}
		if(root1 == null || root2 == null) {
			return false;
		}
		if(root1.val != root2.val) {
			 return false;
		}
		
		boolean left = sym(root1.left, root2.right);
		boolean right = sym(root1.right, root2.left);
		
		return left && right;
	}
}
