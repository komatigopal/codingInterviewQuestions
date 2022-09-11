import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NagarajAnna1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), c[] = new int[N], edges[][] = new int[M][3];
		for (int i = 0; i < N; i++) {
			c[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			edges[i][0] = sc.nextInt();
			edges[i][1] = sc.nextInt();
			edges[i][2] = sc.nextInt();
		}
		sc.close();
		int answer = solve(N, M, edges);
		System.out.println("answer - " + answer);

	}

	private static int solve(int n, int m, int[][] edges) {
		int sum = 0, min = Integer.MAX_VALUE;
		List<Integer> minList = new ArrayList<Integer>();
		for (int j = 1; j <= n; j++) {
			min = Integer.MAX_VALUE;
			for (int i = 0; i < m; i++) {
				if (j == edges[i][0] || j == edges[i][1]) {
					min = checkMin(min, edges[i][2]);
				}
			}
			minList.add(min);
		}
		for (int i : minList) {
			sum += i;
		}
		return sum;
	}

	private static int checkMin(int min, int i) {
		if (min > i) {
			return i;
		}
		return min;
	}
}