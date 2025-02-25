package Lecture35;

import Lecture35.DiameterLeetcode.TreeNode;

public class DiameterOptimised {
	
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
	
	public class dpair{
		int h = -1;
		int d = 0;
	}

	public int diameterOfBinaryTree(TreeNode root) {
		return diabt(root).d;
	}

	private dpair diabt(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return new dpair();
		}
		dpair ldp = diabt(root.left);
		dpair rdp = diabt(root.right);
		
		dpair sdp = new dpair();
		int sd = ldp.h + rdp.h +2;
		sdp.h = Math.max(ldp.h, rdp.h) + 1;
		sdp.d = Math.max(sd, Math.max(ldp.d, rdp.d));
		
		return sdp;
	}
}
