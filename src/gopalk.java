public class gopalk {

	public static void main(String[] args) {
		int k = 2, n, array[] = { -1, 3, 9, -15, 6 };
		n = array.length;
		solve(array, n, k);
	}

	private static void solve(int[] array, int n, int k) {
		int array2[] = new int[n];
		for (int i = 0; i < n; i++) {
			if (array[i] < 0) {
				for(int j=i+1;j<n;j++) {
					
				}
			}
		}
		System.out.println(array2);
	}

}
