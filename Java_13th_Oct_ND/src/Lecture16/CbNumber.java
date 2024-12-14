package Lecture16;

public class CbNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "81615";
		boolean visited[] = new boolean[s.length()];
		int count =0;
		for (int i = 1; i <= s.length(); i++) { //length
			for (int j = 0; j <= s.length()-i; j++) {
				String str = s.substring(j,j+i);
				long n = Long.parseLong(str);
				if(isCbnum(n) && isVisited(j,j+i,visited)) {
					count++;
					System.out.println(str);
					for (int k = j; k < j+i; k++) {
						visited[k] = true;
					}
				}
			}
		}
		System.out.println(count);
	}
	
	public static boolean isVisited(int j, int i, boolean visited[]) {
		// TODO Auto-generated method stub
		for (int k = j; k < i; k++) {
			if(visited[k]) {
				return false;
			}
		}
		return true;
	}

	public static boolean isCbnum(long n) {
		int arr[] = { 2,3,5,7,11,13,17,19,23,29 };
		
		if(n ==0  || n ==1) { //point 1
			return false;
		}
		
		for (int i : arr) { //point 2
			if(n == i) {
				return true;
			}
		}
		
		for (int i : arr) { //point 3
			if(n%i == 0) {
				return false;
			}
		}
		
		return true;
	}
	

}
