import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainRelevel3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a[], k, len, solution = 0;
		List<Integer> list = new ArrayList<Integer>();
		boolean allEven = true;
		for (int i = 0; i < n; i++) {
			len = sc.nextInt();
			k = sc.nextInt();
			a = new int[len];
			list = new ArrayList<Integer>();
			allEven = true;
			for (int j = 0; j < len; j++) {
				a[j] = sc.nextInt();
				if (a[j] % 2 != 0) {
					allEven = false;
					list.add(a[j]);
				}
			}
			if (allEven) {
				Arrays.sort(a);
				solution = a[0] * k;
			} else {
				Collections.sort(list);
				solution = list.get(0);
			}
			System.out.println(solution);
		}
		sc.close();
	}
	/*
	 * private static int solve(int[] a, int k, boolean allEven, List<Integer> list)
	 * { int solution = 0; if (allEven) { Arrays.sort(a); solution = a[0] * k; }
	 * else { Collections.sort(list); solution = list.get(0); } return solution; }
	 */
}
