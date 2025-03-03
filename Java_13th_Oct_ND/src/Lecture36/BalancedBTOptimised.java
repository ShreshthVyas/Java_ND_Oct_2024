package Lecture36;

import Lecture36.BalancedBT.TreeNode;

public class BalancedBTOptimised {
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
	public class bpair{
		boolean isbal = true;
		int ht =-1;
	}

	public boolean isBalanced(TreeNode root) {
		return balanced(root).isbal;
	}

	private bpair balanced(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return new bpair();
		}
		bpair lp = balanced(root.left);
		bpair rp = balanced(root.right);
		
		bpair sp = new bpair();
		sp.ht = Math.max(lp.ht, rp.ht) + 1;
		boolean sb = Math.abs(lp.ht - rp.ht) <2;
		sp.isbal = lp.isbal && rp.isbal && sb;
		
		return sp;
		
	}
	
}
