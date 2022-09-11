package code_test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), m, n;
		for (int i = 0; i < t; i++) {
			m = sc.nextInt();
			n = sc.nextInt();
			solve(m, n);
		}
		sc.close();
	}

	private static void solve(int m, int n) {
		boolean primeNumber = false;
		for (int i = m; i <= n; i++) {
			if (i == 1) {
				continue;
			}
			primeNumber = checkPrime(i);
			if (primeNumber) {
				System.out.println(i);
			}
			primeNumber = false;
		}
	}

	private static boolean checkPrime(int n) {
		boolean primeNumber = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				primeNumber = false;
				break;
			}
		}
		return primeNumber;
	}

}
