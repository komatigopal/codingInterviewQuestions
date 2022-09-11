import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Potti5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = sc.nextInt();
		sc.close();
		int answer = countPalidnroms(s, n);
		System.out.println("answer - " + answer);
	}

	private static int countPalidnroms(String input1, int input2) {
		String s = "";
		boolean status = false;
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < input1.length(); i++) {
			for (int j = i + 1; j <= input1.length(); j++) {
				s = input1.substring(i, j);
				status = check(s);
				if (status) {
					if (!list.contains(s)) {
						if (s.length() > 1) {
							list.add(s);
						}
					}
				}
			}
		}
		return list.size();
	}

	private static boolean check(String s) {
		boolean status = false;
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String s1 = sb.toString();
		if (s1.equals(s)) {
			status = true;
		}
		return status;
	}

}
