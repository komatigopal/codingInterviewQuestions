import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class solution5 {

	private static List<Character> list = new ArrayList<Character>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), length = 0, count = 0;
		String input = "";
		for (int i = 0; i < n; i++) {
			length = sc.nextInt();
			sc.nextLine();
			input = sc.nextLine();
			list = new ArrayList<Character>();
			count = solve(length, input);
			System.out.print(count + " ");
			Collections.sort(list);
			for (char c : list) {
				System.out.print(c);
			}
			System.out.println();
		}
		sc.close();
	}

	private static int solve(int n, String input) {
		int count = 0, maxCount = 1;
		char array[] = input.toCharArray();
		for (int i = 0; i < n; i++) {
			count = 1;
			for (int j = i + 1; j < n; j++) {
				if (array[i] == array[j]) {
					count++;
					i++;
					if (maxCount < count) {
						maxCount = count;
						list = new ArrayList<Character>();
						list.add(array[i]);
					} else if (maxCount == count) {
						if (!list.contains(array[i])) {
							list.add(array[i]);
						}
					}
				} else {
					break;
				}
			}
		}
		if (list.size() < 1) {
			list = new ArrayList<Character>();
			for (int i = 0; i < n; i++) {
				if (!list.contains(array[i])) {
					list.add(array[i]);
				}
			}
		}
		return maxCount;
	}
}
