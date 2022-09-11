import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), n, answer;
		for (int i = 0; i < t; i++) {
			n = sc.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				list.add(sc.nextInt());
			}
			answer = solve(list);
			System.out.println(answer);
		}
		sc.close();
	}

	private static int solve(List<Integer> set) {
		int len = 3, n = set.size();
		HashSet<TreeSet<Integer>> tSet = new HashSet<TreeSet<Integer>>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				TreeSet<Integer> s = new TreeSet<Integer>();
				s = solve(i, j + len, set);
				tSet.add(s);
			}
		}
		return tSet.size();
	}

	private static TreeSet<Integer> solve(int i, int j, List<Integer> set) {
		TreeSet<Integer> s = new TreeSet<Integer>();
		int temp;
		for (; i < j; i++) {
			if (i != j - 1) {
				temp = set.get(i) - set.get(i + 1);
				if (temp < 0) {
					temp *= -1;
				}
				if (temp <= j - 1) {
					s.add(set.get(i));
					s.add(set.get(i + 1));
					s.add(set.get(temp));
				}
			}
		}
		return s;
	}

	/*
	 * private static int solve(int n) { int t1 = 1999, t2 = 2000, answer = 0; while
	 * (n > 0) { if (n == t1 || n == t2) { answer = 1; break; } else { n -= t1; if
	 * (n % t2 == 0) { answer = 1; break; } } } return answer; }
	 */
}
