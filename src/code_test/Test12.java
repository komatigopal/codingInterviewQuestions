package code_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		int solution = solve(s);
		System.out.println(solution);
	}

	private static int solve(String s) {
		int solution = 1, count = 0;
		if (s.length() == 0) {
			return 0;
		}
		List<Character> list = new ArrayList<Character>();
		for (char ch : s.toCharArray()) {
			if (list.contains(ch)) {
				if (solution < count) {
					solution = count;
				}
				count = 1;
				list = new ArrayList<Character>();
			} else {
				count++;
				list.add(ch);
			}
		}
		if (solution < count) {
			solution = count;
		}
		return solution;
	}

}
