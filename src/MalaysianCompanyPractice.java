import java.util.Scanner;

public class MalaysianCompanyPractice {
	private static final String star = "*", minus = "-", space = " ";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), maxStars = n;
		sc.close();
		maxStars++;
		if (n % 2 != 0) {
			maxStars++;
		}
		for (int i = maxStars; i >= 1; i = i - 2) {
			print(i, star);
			if (i != 1) {
				System.out.print(space);
			}
		}
		print(n, minus);
		for (int i = 1; i <= maxStars; i = i + 2) {
			print(i, star);
			if (i != maxStars) {
				System.out.print(space);
			}
		}
	}

	private static void print(int n, String s) {
		for (int i = 0; i < n; i++) {
			System.out.print(s);
		}
	}
}
