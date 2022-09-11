package code_test;

import java.util.Scanner;

public class Amazon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();
		solve(a, b);
	}

	private static void solve(int a, int b) {
		int quatient = 0;
		boolean status = false;
		if (a == 0) {
			System.out.println("division is not possible");
		} else if (b == 0) {
			System.out.println(a + ", " + quatient);
		} else {
			if (a < 0 && b < 0) {
				devision(a, b);
			} else if (a > 0 && b > 0) {
				positiveDivision(a, b, status);
			} else {
				if (a < 0) {
					int temp = a;
					a += a;
					a -= temp;
				}
			}
		}
	}

	private static void positiveDivision(int a, int b, boolean status) {
		int quatient = 0;
		while (a > b) {
			quatient++;
			a -= b;
		}
		System.out.println(quatient + ", " + a);
	}

	private static void devision(int a, int b) {
		int quatient = 0;
		while (a < b) {
			quatient++;
			a -= b;
		}
		System.out.println(quatient + ", " + a);
	}

}
