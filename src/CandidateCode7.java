import java.util.Scanner;

public class CandidateCode7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), l = sc.nextInt(), k = sc.nextInt();
		sc.close();
		String solution = solve(n, l, k);
		System.out.println(solution);
	}

	private static String solve(int n, int l, int k) {
		String solution = "";
		String temp = Integer.toString(l);
		solution = temp.substring(0, 1);
		for (int i = 0; i < k; i++) {
			if (solution.length() <= n) {
				solution += "0";
			} else {
				break;
			}
		}
		if (solution.length() < n) {
			int end = solution.length();
			solution += temp.substring(end, n);
		}
		return solution;
	}

	/*
	 * private static String solve(int a, int n, int[] arr) { int max = 0, sum = 0;
	 * String solution = ""; for (int i = 0; i < n; i++) { for (int j = i + 1; j <
	 * n; j++) { sum = arr[i] + arr[j]; if (sum <= a && sum > max) { max = sum;
	 * solution = (i + 1) + " " + (j + 1); } } } return solution; }
	 */

}