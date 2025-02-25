package Lecture35;

import Lecture35.FlipEquivalentBTLeetcode.TreeNode;

public class LowestCommonAncestor {

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

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null) {
			return null;
		}
		if(root == p || root == q) {
			return root;
		}
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		
		if(right!=null && left!=null) {
			return root;
		}
		if(right!=null) {
			return right;
		}
		else {
			return left;
		}
	}
}
