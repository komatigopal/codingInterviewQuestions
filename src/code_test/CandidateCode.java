package code_test;

import java.util.Scanner;

public class CandidateCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), t = 0;
		for (int i = 0; i < n; i++) {
			t = sc.nextInt();
			System.out.println(t - 1);
		}
		sc.close();
	}
}
 