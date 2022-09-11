import java.util.Scanner;

public class Potti2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int m = sc.nextInt();
		sc.close();
		int answer = solve(s, m);
		System.out.println("answer - " + answer);
	}

	private static int solve(String s, int m) {
		int noOfClicks = 0, noOfCopies = 0;

		noOfClicks = (int) (noOfClicks * Math.pow(10, 4)) + noOfCopies;
		return noOfClicks;
	}

}
