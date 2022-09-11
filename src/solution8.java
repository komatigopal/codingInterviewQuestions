import java.math.BigInteger;
import java.util.Scanner;

public class solution8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), h = 0;
		BigInteger solution = BigInteger.ZERO;
		for (int i = 0; i < n; i++) {
			h = sc.nextInt();
			if (h < 4) {
				if (h == 1) {
					solution = new BigInteger("8");
				} else if (h == 2) {
					solution = BigInteger.TEN;
				} else {
					solution = new BigInteger("18");
				}
			} else {
				solution = solve(h);
			}
			System.out.println(solution);
			System.out.println("fact - " + factorial(h));
		}
		sc.close();
	}

	private static BigInteger solve(int h) {
		BigInteger solution = BigInteger.ZERO, a = new BigInteger("8"), b = BigInteger.TEN, c = new BigInteger("18");
		for (int i = 4; i <= h; i++) {
			solution = a.add(b);
			solution = solution.add(c);
			a = b;
			b = c;
			c = solution;
		}
		return solution;
	}

	static long factorial(int n) {
		long M = 1000000007;

		long f = 1;
		for (int i = 1; i <= n; i++)
			f = (f * i) % M; // Now f never can
								// exceed 10^9+7
		return f;
	}
}