package Lecture34;

public class BTClient {
	// 10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 70 false false
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
//		bt.Display();
//		System.out.println(bt.Max());
//		System.out.println(bt.Height());
//		System.out.println(bt.Find(90));
//		bt.PostOrder();
//		bt.PreOrder();
//		bt.InOrder();
		bt.LevelOrder();
		bt.LevelOrderLevelwise();
	}

}
