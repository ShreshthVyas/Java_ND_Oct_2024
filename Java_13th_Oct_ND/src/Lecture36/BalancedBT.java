package Lecture36;

import Lecture35.DiameterLeetcode.TreeNode;

public class BalancedBT {

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

	public boolean isBalanced(TreeNode root) {
		if(root == null) {
			return true;
		}
		boolean lb = isBalanced(root.left);
		boolean rb = isBalanced(root.right);
		int lh = height(root.left);
		int rh = height(root.right);
		int diff = Math.abs(rh - lh);
		boolean sb = diff<2;
		
		return lb && rb && sb;
	}
	
	private int height(TreeNode node) {
		// TODO Auto-generated method stub
		if(node  == null) {
			return -1;
		}
		int lh = height(node.left);
		int rh = height(node.right);

		return Math.max(lh, rh)+1;
	}
}
