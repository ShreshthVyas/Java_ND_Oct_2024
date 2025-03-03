package Lecture36;


public class DeleteinBST {

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

	public TreeNode deleteNode(TreeNode root, int key) {
		if(root == null) {
			return null;
		}
		if(key > root.val) {
			root.right = deleteNode(root.right, key);
		}
		else if(key < root.val){
			root.left = deleteNode(root.left, key);
		}
		else { // key found
			if(root.left == null) { // 0 child & 1 child
				return root.right;
			}
			else if(root.right == null) { // 1 child
				return root.left;
			}
			else { // both child present
				int leftmax = max(root.left);
				root.left = deleteNode(root.left, leftmax);
				root.val = leftmax;
			}
		}
		return root;
	}
	
	public int max(TreeNode root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		
		int right = max(root.right);
		return Math.max(root.val, right);
		
	}

}
