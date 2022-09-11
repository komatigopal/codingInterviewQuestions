package code_test;

import java.util.Scanner;

public class Test123 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		StringBuffer str = new StringBuffer();
		str.append(input);
		str.reverse();
		input = String.valueOf(str);
		input = solution(input, 'A', 'T');
		input = solution(input, 'G', 'C');
		System.out.println(input);
	}

	private static String solution(String input, char c, char d) {
		char[] array = input.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == c) {
				array[i] = d;
			} else if (array[i] == d) {
				array[i] = c;
			}
		}
		return String.valueOf(array);
	}
}
