import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Potti {

	private static int MinCost(int n, List<Integer> A) {
		Collections.sort(A);
		for (int i = 0; i < A.size() - 1; i++) {
			if (A.get(i) == A.get(i + 1)) {
				A.remove(i);
				A.remove(i);
				i = -1;
				n = A.size();
				return MinCost(n, A);
			}
		}
		return A.size();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		sc.close();
		int answer = MinCost(n, a);
		System.out.println("answer - " + answer);
	}

}
