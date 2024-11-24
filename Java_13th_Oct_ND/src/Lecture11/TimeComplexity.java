package Lecture11;

public class TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int i = 0;

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		while (i < n) { // O(n)
			//
			i++;
		}

		while (i <= n) {// O(n)

			i += 2;
		}

		while (i <= n) { // O(n)

			i += 3;
			i += 2;
		}

		while (i <= n) { // O(Log N)

			n = n / 2;
		}

		while (i <= n) { // O(Log N)

			i= i*2;
		}
		
		while (i <= n) { // O(Log N)

			i= i*2;
			i*=3;
		}
		int k =10;
		while (i <= n) { // O(Log N base k)

			i= i*k;
		}
		
		while (i <= n) { // O(Log N base k)

			n = n/k;
		}
		
		for (int j = 0; j < n; j++) {
			for (int a = 0; a < n; a++) {
				//O(n^2)
			}
		}
		
		for (int j = 0; j < n; j++) {
			for (int a = j; a < n; a++) {
				//O(n^2)
			}
		}
		
		for (int j = 0; j < n; j++) {
			for (int a = 0; a <=j; a++) {
				//O(n^2)
			}
		}
		
		for (int j = 0;j*j <=n; j++) {
			// O(sqrt N)
		}
		
		for (int a = 0; a <=n ; a++) {
			for (int b= 1; b <= a*a; b++) {
				for (int c = 0; c <=n/2; c++) {
					//O(n^4)
				}
			}
		}
		
		for (int j = 1; j <=n ; j++) {
			for (int a = 1; a <= n; a+=j) {
				// O(N Log N)
			}
		}
		
		for (int a = n/2; a <=n ; i++) {
			for (int b= 1; b <= n/2; b++) {
				for (int c = 1; c <=n/2; c*=2) {
					//O(N^2 Log N)
				}
			}
		}
		// Binary Search - O(logN)
		// Linear Search - O(N)
		// Bubble Sort - O(N^2)
		// Insertion Sort - O(N^2)
		// Selection Sort - O(N^2)

	}

}
