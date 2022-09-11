import java.text.ParseException;
import java.util.Scanner;

public class solution {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String input;
		int t = sc.nextInt(), n, solution;
		for (int i = 0; i < t; i++) {
			n = sc.nextInt();
			sc.nextLine();
			input = sc.nextLine();
			solution = solve(n, input);
			System.out.println(solution);
		}
		sc.close();
	}

	private static int solve(int n, String input) {
		int count = 0, firstLetter = input.charAt(0);
		count = count(n, input, firstLetter);
		return count;
	}

	private static int count(int n, String input, int firstLetter) {
		int count = 0;
		boolean status = true;
		for (int i = 1; i < n; i++) {
			if (input.charAt(i) == firstLetter) {
				if (!status) {
					count++;
				}
				status = true;
			} else {
				status = false;
			}
		}
		return count;
	}
}