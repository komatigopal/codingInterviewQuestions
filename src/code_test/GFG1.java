package code_test;

class GFG1 {

	// function to find minimum number of
	// operations required
	static int minOpeartions(int arr[], int n, int x) {

		int k = x, i = 0;
		n--;

		while (n > -1) {

			// if the element is less than x.
			if (arr[n] < x)
				k--;

			// if the element equals to x.
			if (arr[n] == x)
				k++;

			n--;
		}

		return k - 1;
	}
	
	
	

	// driver function
	public static void main(String args[]) {
		int arr[] = { 10, 7, 8, 23 };
		int n = arr.length;
		int x = 3;

		for (int i = 1; i < 8; i++) {
			System.out.println(minOpeartions(arr, n, i));
		}
		// output
	}
}