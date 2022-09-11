package code_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class GFG {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); int t = sc.nextInt(); String s,
		 * solution; sc.nextLine(); for (int i = 0; i < t; i++) { s = sc.nextLine();
		 * solution = solve(s); System.out.println(solution); } sc.close();
		 */
		/*
		 * long m = 5, n = 6, solution; solution = solve(m, n);
		 * System.out.println(solution);
		 */
		int n = 4, a = 2, x[] = { 10, 4, 2, 17 }, solution;
		solution = solve(n, a, x);
		System.out.println(solution);
	}

	private static int solve(int n, int a, int[] x) {
		int sum = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i : x) {
			sum = a - i;
			if (sum < 0) {
				sum *= -1;
			}
			list.add(sum);
		}
		Collections.sort(list);
		sum = list.get(n - 1) + list.get(n - 2);
		return sum;
	}

	private static long solve(long N, long M) {
		long solution = 0, temp = 0, max = 0;
		if (N > M) {
			temp = M;
		} else {
			temp = N;
		}
		for (long i = 1; i <= Math.sqrt(temp); i++) {
			if (M % i == 0 && N % i == 0) {
				if (max < i) {
					max = i;
				}
			}
		}
		solution = N / max + M / max;
		return solution;
	}

	private static String solve(String s) {
		String solution = "NO";
		int lowerCaseCount = 0, upperCaseCount = 0, numericCount = 0;
		char array[] = s.toCharArray();
		for (char ch : array) {
			if (ch >= 97 && ch <= 122) {
				lowerCaseCount++;
			} else if (ch >= 65 && ch <= 90) {
				upperCaseCount++;
			} else if (ch >= 48 && ch <= 57) {
				numericCount++;
			}
		}
		if (lowerCaseCount > 0 && upperCaseCount > 0 && numericCount > 0) {
			solution = "YES";
		}
		return solution;
	}
}