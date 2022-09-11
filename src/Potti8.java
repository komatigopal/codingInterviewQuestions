import java.util.Scanner;

public class Potti8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong(), r = sc.nextLong();
		sc.close();
		long answer = solve(l, r);
		System.out.println(answer);
	}

	private static long solve(long l, long r) {
		long sum = 0l, noOfDigits = countDigits(l);
		for (long i = l; i < r; i++) {
			sum += i * noOfDigits;
		}
		noOfDigits = countDigits(r);
		sum += r * noOfDigits;
		return sum;
	}

	private static long countDigits(long n) {
		long count = 0;
		while (n != 0) {
			n /= 10;
			++count;
		}
		return count;
	}

}
