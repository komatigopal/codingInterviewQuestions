import java.util.Scanner;

public class solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = "", s1 = "", solution = "";
		for (int i = 0; i < n; i++) {
			s = sc.nextLine();
			s1 = sc.nextLine();
			solution = solve(s, s1);
			System.out.println(solution);
		}
		sc.close();
	}

	private static String solve(String s, String s1) {
		char c[] = s.toCharArray(), c1[] = s1.toCharArray();
		String status = "NO";
		int index = 0, count = 0;
		if (s.contains(s1)) {
			count = c1.length;
		} else {
			for (int i = 0; i < c1.length; i++) {
				for (int j = index; j < c.length; j++) {
					if (c1[i] == c[j]) {
						index = j;
						count++;
						break;
					}
				}
			}
		}
		if (c1.length == count) {
			status = "YES";
		}
		return status;
	}

}
