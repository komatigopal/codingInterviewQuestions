import java.util.Scanner;

public class Kalyan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		int count = minimumFlips(s);
		System.out.println("answer  - " + count);
	}

	public static int minimumFlips(String target) {
		char curr = '1';
		int count = 0;
		for (int i = 0; i < target.length(); i++) {
			if (target.charAt(i) == curr) {
				count++;
				curr = (char) (48 + (curr + 1) % 2);
			}
		}
		return count;
	}
}
