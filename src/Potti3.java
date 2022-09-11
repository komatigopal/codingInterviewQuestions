import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Potti3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = 0;
		List<Integer> p = new ArrayList<Integer>();
		List<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new ArrayList<Integer>();
		List<Integer> r = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			p.add(sc.nextInt());
		}
		for (int i = 0; i < n; i++) {
			x.add(sc.nextInt());
		}
		m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			y.add(sc.nextInt());
		}
		for (int i = 0; i < m; i++) {
			r.add(sc.nextInt());
		}
		sc.close();
		int answer = getMax(n, p, x, m, y, r);
		System.out.println("answer - " + answer);
	}

	private static int getMax(int N, List<Integer> P, List<Integer> X, int M, List<Integer> Y, List<Integer> R) {
		int sumOfPosRange = 0, startPos = 0, sum = 0;
		for (int i = 0; i < M; i++) {
			startPos = Y.get(i);
			sumOfPosRange = Y.get(i) + R.get(i);
			for (int j = 0; j < N; j++) {
				if (X.get(j) >= startPos && X.get(j) <= sumOfPosRange) {
					P.set(j, 0);
					if (j == 0 && j != P.size() - 1) {
						P.set(j, 0);
					} else {
						P.remove(j);
					}
				}
			}
		}
		for (int i = 0; i < P.size(); i++) {
			sum += P.get(i);
		}
		return sum;
	}

}
