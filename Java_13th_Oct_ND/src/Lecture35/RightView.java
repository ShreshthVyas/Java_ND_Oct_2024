package Lecture35;

import java.util.ArrayList;
import java.util.List;

import Lecture35.LowestCommonAncestor.TreeNode;

public class RightView {
	
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
	
	List<Integer>  list;
	int maxlvl;
	public List<Integer> rightSideView(TreeNode root) {
	        list =  new ArrayList<>();
	        maxlvl =-1;
	        rec(root,0);
	        return list;
	}
	private void rec(TreeNode root, int cl) {
		// TODO Auto-generated method stub
		if(root == null) {
			return ;
		}
		if(maxlvl<cl) {
			list.add(root.val);
			maxlvl = cl;
		}
		rec(root.right, cl+1);
		rec(root.left, cl+1);	
	}
}
