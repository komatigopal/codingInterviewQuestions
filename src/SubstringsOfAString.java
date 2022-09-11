import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SubstringsOfAString {
	static String[] vowelList = { "a", "e", "i", "o", "u" };

	public static int splitSubstrings(String s) {
		int i, j, count = 0, stringLength = s.length();
		String sub = "";
		List<String> list = new ArrayList<String>();
		for (i = 0; i < stringLength; i++) {
			for (j = i + 1; j <= stringLength; j++) {
				sub = s.substring(i, j).trim();
				if (!list.contains(sub)) {
					list.add(sub);
					for (String str : vowelList) {
						if (sub.contains(str)) {
							count++;
							break;
						}
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stringInput = sc.nextLine();
		sc.close();
		int count = splitSubstrings(stringInput);
		System.out.println(count);
	}
}