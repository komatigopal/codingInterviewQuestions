import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateCode8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		List<Integer> list = new ArrayList<Integer>();
		if (n <= 1300) {
			for (int i = 0; i <= 1955; i++) {
				String s = Integer.toString(i);
				if (!s.contains("2") && !s.contains("14")) {
					list.add(i);
				}
			}
			System.out.println(list.get(n));
		}
	}
}