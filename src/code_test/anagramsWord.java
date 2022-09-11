package code_test;

import java.util.Scanner;

class anagramsWord {
	static int count = 0;

	public static void compute(String s1, String s2) {
		if (s2.length() <= 1) {
			count++;
			System.out.print(s1 + s2 + " ");
		} else {
			for (int i = 0; i < s2.length(); i++) {
				String a = s2.substring(i, i + 1);
				String b = s2.substring(0, i);
				String c = s2.substring(i + 1);
				compute(s1 + a, b + c); // recursive method
			}
		}
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String s = sc.next();
		sc.close();
		System.out.println("The Anagrams are : ");
		compute("", s);
		System.out.println("Total NO. of Anagrams = " + count);
	}
}