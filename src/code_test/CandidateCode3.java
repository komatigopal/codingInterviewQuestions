package code_test;

import java.util.Scanner;

public class CandidateCode3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), fine = 0;
		sc.close();
		String action = "No Fine";
		if (n > 100 && n <= 200) {
			fine = (n - 100) * 500;
			action = "Warning";
		} else if (n > 100) {
			fine = (n - 100) * 1000;
			action = "Register Case";
		}
		System.out.println(fine + " " + action);
	}
}
