package Lecture36;

public class BST {

	public class Node {
		int val;
		Node left;
		Node right;

		public Node() {

		}

		public Node(int val, Node left, Node right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	public BST(int in[]) {
		this.root =  createTree(in,0,in.length-1);
	}

	private Node createTree(int[] in,int si,int ei) {
		// TODO Auto-generated method stub
		if(si>ei) {
			return null;
		}
		
		int mid = (si + ei) / 2;
		Node nn =  new Node();
		nn.val = in[mid];
		
		nn.left = createTree(in, si, mid-1);
		nn.right = createTree(in, mid+1, ei);
		
		return nn;
	}

	private Node root;

	public void Display() {

		display(this.root);
	}

	private void display(Node temp) {
		// TODO Auto-generated method stub
		if (temp == null) {
			return;
		}
		String s = "" + temp.val;
		if (temp.left != null) {
			s = temp.left.val + " <== " + s;
		} else {
			s = ". <== " + s;
		}
		if (temp.right != null) {
			s = s + " ==> " + temp.right.val;
		} else {
			s = s + " ==> .";
		}
		System.out.println(s);
		display(temp.left);
		display(temp.right);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,5,6,10,11,15,20};
		BST bst = new BST(arr);
		
		bst.Display();
	}

}
