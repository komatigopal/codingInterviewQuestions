import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), n, answer;
		for (int i = 0; i < t; i++) {
			n = sc.nextInt();
			answer = solve(n);
			System.out.println(answer);
		}
		sc.close();
	}

	private static int solve(int n) {
		int t1 = 1999, t2 = 2000, answer = 0;
		while (n > 0) {
			if (n == t1 || n == t2) {
				answer = 1;
				break;
			} else {
				n -= t1;
				if (n % t2 == 0) {
					answer = 1;
					break;
				}
			}
		}
		return answer;
	}

}
