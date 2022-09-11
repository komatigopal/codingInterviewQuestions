import java.util.Scanner;

public class CandidateCode6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), a, n, arr[];
		String solution = "";
		for (int i = 0; i < t; i++) {
			a = sc.nextInt();
			n = sc.nextInt();
			arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}
			solution = solve(a, n, arr);
			System.out.println(solution);
		}
		sc.close();

	}

	private static String solve(int a, int n, int[] arr) {
		int max = 0, sum = 0;
		String solution = "";
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				sum = arr[i] + arr[j];
				if (sum <= a && sum > max) {
					max = sum;
					solution = (i + 1) + " " + (j + 1);
				}
			}
		}
		return solution;
	}

}