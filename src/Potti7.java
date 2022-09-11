import java.util.Scanner;

public class Potti7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
		sc.close();
		int answer = solve(n, x, y);
		System.out.println(answer);
	}

	private static int solve(int n, int x, int y) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % x == 0 || i % y == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
