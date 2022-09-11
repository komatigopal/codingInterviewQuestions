import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String solution = solve(s);
		System.out.println(solution);
	}

	private static String solve(String s) {
		char array[] = s.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (char c : array) {
			if (!list.contains(c)) {
				list.add(c);
			}
		}
		char array2[] = new char[list.size()];
		int i = 0;
		for (char c : list) {
			array2[i++] = c;
		}
		return new String(array2);
	}

}
