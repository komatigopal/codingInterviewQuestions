import java.util.Scanner;

public class Potti6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int answer = solve(n);
		System.out.println(answer);
	}

	private static int solve(int n) {
		int digit = 0, sum = 0;
		boolean status = false;
		while (n > 0) {
			digit = n % 10;
			n = n / 10;
			status = check(digit);
			if (status) {
				sum += digit;
			}
		}
		return sum;
	}

	private static boolean check(int n) {
		boolean status = false;
		int flag = 0;
		if (n > 1) {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				status = true;
			}
		}
		return status;
	}

}
