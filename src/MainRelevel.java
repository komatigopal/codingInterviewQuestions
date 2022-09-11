import java.util.Scanner;

public class MainRelevel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt(), a, solution = 0;
		for (long i = 0; i < n; i++) {
			a = sc.nextLong();
			// solution = solve(a);
			solution = 0;
			for (long k = 1; k <= Math.sqrt(a); k++) {
				for (long m = k + 1; m <= Math.sqrt(a); m++) {
					if (((3 * k) + (7 * m) == a) || ((3 * m) + (7 * k) == a)) {
						solution = 1;
						break;
					}
				}
				if (solution == 1) {
					break;
				}
			}
			System.out.println(solution);
		}
		sc.close();
	}

	/*
	 * private static long solve(long a) { long solution = 0; for (long k = 1; 3 * k
	 * <= a; k++) { for (long m = k + 1; 3 * m < a; m++) { if ((3 * k + 7 * m == a)
	 * || (3 * m + 7 * k == a)) { solution = 1; break; } } if (solution == 1) {
	 * break; } else { System.out.println("i - " + k); } } return solution; }
	 */
}
