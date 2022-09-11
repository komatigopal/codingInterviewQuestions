/* Read input from STDIN. Print your output to STDOUT*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CandidateCode10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), n, budget;
		List<Integer> tops;
		List<Integer> skirts;
		String solution;
		for (int i = 0; i < t; i++) {
			n = sc.nextInt();
			budget = sc.nextInt();
			tops = new ArrayList<Integer>();
			skirts = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				tops.add(sc.nextInt());
			}
			for (int j = 0; j < n; j++) {
				skirts.add(sc.nextInt());
			}
			Collections.sort(tops);
			Collections.sort(skirts, Collections.reverseOrder());
			solution = solve(n, budget, tops, skirts);
			System.out.println(solution);
		}
		sc.close();

	}

	private static String solve(int n, int budget, List<Integer> tops, List<Integer> skirts) {
		String status = "NO";
		int sum = 0, product;
		for (int i = 0; i < n; i++) {
			product = tops.get(i) * skirts.get(i);
			sum += product;
		}
		if (sum <= budget) {
			status = "YES";
		}
		return status;
	}
}