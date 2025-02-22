package Lecture34;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
	// 10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 70 false false
	public class Node{
		int val;
		Node left;
		Node right;
		
		public Node() {
			
		}
		public Node(int val , Node left, Node right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	private Node root;
	Scanner sc = new Scanner(System.in);
	public BinaryTree() {
		this.root = createTree();
	}
	private Node createTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		
//		System.out.println("Has Left child ?");
		boolean hlc = sc.nextBoolean();
		// left subtree call
		if(hlc) {
			nn.left = createTree();
		}
//		System.out.println("Has Right child ?");
		boolean hrc = sc.nextBoolean();
		//right subtree call
		if(hrc) {
			nn.right = createTree();
		}
		return nn;
	}
	
	public void Display() {
		
		display(this.root);
	}
	private void display(Node temp) {
		// TODO Auto-generated method stub
		if(temp == null) {
			return;
		}
		String s = ""+temp.val;
		if(temp.left!=null) {
			s = temp.left.val + " <== " + s;
		}
		else {
			s = ". <== " + s;
		}
		if(temp.right!=null) {
			s = s + " ==> " + temp.right.val;
		}
		else {
			s = s + " ==> .";
		}
		System.out.println(s);
		display(temp.left);
		display(temp.right);
		
	}
	
	public int Max() {
		return max(this.root);
	}
	private int max(Node node) {
		// TODO Auto-generated method stub
		if(node  == null) {
			return Integer.MIN_VALUE;
		}
		int leftmax = max(node.left);
		int rightmax = max(node.right);
		
		return Math.max(node.val, Math.max(leftmax, rightmax));
	}
	
	public boolean Find(int item) {
		return find(this.root,item);
	}
	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if(node == null) {
			return false;
		}
		if(node.val == item) {
			return true;
		}
		boolean left = find(node.left, item);
		boolean right = find(node.right, item);
		return left || right ;
	}
	
	public int Height() {
		return height(this.root);
	}
	private int height(Node node) {
		// TODO Auto-generated method stub
		if(node  == null) {
			return -1;
		}
		int lh = height(node.left);
		int rh = height(node.right);

		return Math.max(lh, rh)+1;
	}
	
	public void PreOrder() {
		preorder(this.root);
		System.out.println();
	}
	private void preorder(Node node) { // NLR
		// TODO Auto-generated method stub
		if(node  == null) {
			return; 
		}
		
		System.out.print(node.val+ " ");
		preorder(node.left);
		preorder(node.right);
		
	}
	public void PostOrder() {
		postorder(this.root);
		System.out.println();
	}
	private void postorder(Node node) { // LRN
		// TODO Auto-generated method stub
		if(node  == null) {
			return; 
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.val+ " ");
		
	}
	public void InOrder() {
		inorder(this.root);
		System.out.println();
	}
	private void inorder(Node node) { // LNR
		// TODO Auto-generated method stub
		if(node  == null) {
			return; 
		}
		inorder(node.left);
		System.out.print(node.val+ " ");
		inorder(node.right);
	}
	
	public void LevelOrder() {
		Queue<Node>  q = new LinkedList<>();
		q.add(this.root);
		
		while(!q.isEmpty()) {
			Node temp = q.poll();
			System.out.print(temp.val + " ");
			if(temp.left!=null) {
				q.offer(temp.left);
			}
			if(temp.right!=null) {
				q.offer(temp.right);
			}
		}
		System.out.println();
	}
	public void LevelOrderLevelwise() {
		Queue<Node>  q = new LinkedList<>();
		Queue<Node>  h = new LinkedList<>();
		q.add(this.root);
		
		while(!q.isEmpty()) {
			Node temp = q.poll();
			System.out.print(temp.val + " ");
			if(temp.left!=null) {
				h.offer(temp.left);
			}
			if(temp.right!=null) {
				h.offer(temp.right);
			}
			if(q.isEmpty()) {
				q = h;
				h = new LinkedList<>();
				System.out.println();
			}
		}
		System.out.println();
	}
	
}
