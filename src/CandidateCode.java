/* Read input from STDIN. Print your output to STDOUT*/

import java.util.Scanner;

public class CandidateCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt(), s = sc.nextInt(), n = sc.nextInt(), t[] = new int[n], x[] = new int[n], solution;
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();
		solution = solve(p, s, n, t, x);
		System.out.println(solution);
	}

	private static int solve(int p, int s, int n, int[] t, int[] x) {
		// TODO Auto-generated method stub
		return 0;
	}

}