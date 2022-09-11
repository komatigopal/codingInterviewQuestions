package code_test.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class solution2 {
	static int count = 0;
	static List<String> list = new ArrayList<String>();

	public static void compute(String s1, String s2) {
		if (s2.length() <= 1) {
			count++;
			list.add(s1 + s2);
		} else {
			for (int i = 0; i < s2.length(); i++) {
				String a = s2.substring(i, i + 1);
				String b = s2.substring(0, i);
				String c = s2.substring(i + 1);
				compute(s1 + a, b + c);
			}
		}
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = "", s1 = "";
		for (int i = 0; i < n; i++) {
			s = sc.nextLine();
			list = new ArrayList<String>();
			compute(s1, s);
			Collections.sort(list);
			for (String str : list) {
				System.out.print(str + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}