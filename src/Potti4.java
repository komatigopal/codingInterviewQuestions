import java.util.Scanner;

public class Potti4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String answer = reverseString(s);
		System.out.println("answer - " + answer);
	}

	private static String reverseString(String input1) {
		String a[] = input1.split(" "), answer = "";
		for (int i = a.length - 1; i >= 0; i--) {
			answer += a[i];
			if (i != 0) {
				answer += " ";
			}
		}
		return answer;
	}

}
