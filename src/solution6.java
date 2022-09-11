import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), h = 0, solution = 0;
		String input = "";
		for (int i = 0; i < n; i++) {
			h = sc.nextInt();
			sc.nextLine();
			input = sc.nextLine();
			String array[] = input.split(" ");
			List<Integer> list = new ArrayList<Integer>();
			for (String s : array) {
				list.add(Integer.parseInt(s));
			}
			for (int j = 1; j < h; j++) {
				String input2 = sc.nextLine();
				String array2[] = input2.split(" ");
				list = solve(list, array2, array2.length);
			}
			solution = list.get(0);
			System.out.println(solution);
		}
		sc.close();
	}

	private static List<Integer> solve(List<Integer> list2, String[] array2, int length) {
		List<Integer> list = new ArrayList<Integer>();
		int count = 0;
		for (int i = 0; i < length; i++) {
			list.add(logicGates(list2.get(count++), list2.get(count++), array2[i]));
		}
		return list;
	}

	private static Integer logicGates(Integer a, Integer b, String string) {
		int solution = 0;
		if (string.equalsIgnoreCase("AND")) {
			solution = a * b;
		} else if (string.equalsIgnoreCase("NAND")) {
			if (a == 0 || b == 0)
				solution = 1;
			else
				solution = 0;
		} else if (string.equalsIgnoreCase("OR")) {
			if (a == 1 || b == 1)
				solution = 1;
			else
				solution = 0;
		} else if (string.equalsIgnoreCase("NOR")) {
			if (a == 0 && b == 0)
				solution = 1;
			else
				solution = 0;
		} else if (string.equalsIgnoreCase("XOR")) {
			if (a == b)
				solution = 0;
			else
				solution = 1;
		} else if (string.equalsIgnoreCase("XNOR")) {
			if (a == b)
				solution = 1;
			else
				solution = 0;
		}
		return solution;
	}
}
