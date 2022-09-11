package code_test.a;

import java.util.Scanner;

public class solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), m = 0, n = 0, days = 0;
		char a[][], s[];
		for (int c = 0; c < t; c++) {
			m = sc.nextInt();
			n = sc.nextInt();
			a = new char[m][n];
			sc.nextLine();
			for (int i = 0; i < m; i++) {
				s = sc.nextLine().toCharArray();
				for (int j = 0; j < n; j++) {
					a[i][j] = s[j];
				}
			}
			System.out.println(a);
			days = solve(m, n, a);
			System.out.println(days);
		}
		sc.close();
	}

	private static int solve(int m, int n, char[][] a) {
		// TODO Auto-generated method stub
		return 0;
	}
}