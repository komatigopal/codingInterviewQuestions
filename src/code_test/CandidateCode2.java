package code_test;

import java.util.Scanner;

public class CandidateCode2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		StringBuilder reverseString = new StringBuilder();
		reverseString.append(input);
		reverseString.reverse();
		input = reverseString.toString();
		input = solution(input, 'A', 'T');
		input = solution(input, 'C', 'G');
		System.out.println(input);
	}

	private static String solution(String input, char occureChar, char replaceChar) {
		char array[] = input.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == occureChar) {
				array[i] = replaceChar;
			} else if (array[i] == replaceChar) {
				array[i] = occureChar;
			}
		}
		return new String(array);
	}
}
