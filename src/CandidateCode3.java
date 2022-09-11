import java.util.Arrays;
import java.util.Scanner;

public class CandidateCode3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), n, g, gp[];
		long solution;
		for (int i = 0; i < t; i++) {
			n = sc.nextInt();
			g = sc.nextInt();
			gp = new int[g];
			for (int j = 0; j < g; j++) {
				gp[j] = sc.nextInt();
			}
			solution = 0;
			Arrays.sort(gp);
			for (int k = 0; k < n; k++) {
				solution += gp[k];
			}
			System.out.println(solution);
		}
		sc.close();
	}

	private static long solve(int[] arr, int n) {
		long solution = 0;
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			solution += arr[i];
		}
		return solution;
	}

}
