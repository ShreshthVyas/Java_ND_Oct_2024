package Lecture40;
import java.util.*;
public class VerticalOrderTraversal {

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
	
	TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map;
	public List<List<Integer>> verticalTraversal(TreeNode root) {
		map = new TreeMap<>();
		dfs(root,0,0);
		List<List<Integer>> ans = new ArrayList<>();
		
		for (int i : map.keySet()) { // vertical index
			List<Integer> list = new ArrayList<>();
			for (int j : map.get(i).keySet()) { // horizontal levels
				PriorityQueue<Integer> pq = map.get(i).get(j);
				while(!pq.isEmpty()) {
					list.add(pq.poll());
				}
			}
			ans.add(list);
		}
		
		return ans;

	}
	private void dfs(TreeNode root, int vidx, int hidx) {
		// TODO Auto-generated method stub
		if(root ==null) {
			return;
		}
		map.putIfAbsent(vidx, new TreeMap<>());
		map.get(vidx).putIfAbsent(hidx, new PriorityQueue<Integer>());
		map.get(vidx).get(hidx).add(root.val);
		
		dfs(root.left, vidx-1, hidx+1);
		dfs(root.right, vidx+1, hidx+1);
	}
}
