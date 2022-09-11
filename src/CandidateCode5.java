import java.math.BigInteger;
import java.util.Scanner;

public class CandidateCode5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), n, c1, c2;
		BigInteger min = BigInteger.ZERO;
		for (int j = 0; j < t; j++) {
			n = sc.nextInt();
			c1 = sc.nextInt();
			c2 = sc.nextInt();
			min = solve(n, c1, c2);
			System.out.println(min);
		}
		sc.close();
	}

	private static BigInteger solve(int n, int c1, int c2) {
		BigInteger min = BigInteger.ZERO;
		BigInteger sum = BigInteger.ZERO;
		BigInteger nBig = new BigInteger(Integer.toString(n));
		BigInteger c1Big = new BigInteger(Integer.toString(c1));
		BigInteger c2Big = new BigInteger(Integer.toString(c2));
		for (BigInteger i = BigInteger.ZERO; (nBig.compareTo(i) == 1 || nBig.compareTo(i) == 0); i = i
				.add(new BigInteger("1"))) {
			BigInteger iN = nBig.subtract(i);
			BigInteger c1Value = c1Big.multiply(i);
			c1Value = c1Value.multiply(i);
			BigInteger c2Value = c2Big.multiply(iN);
			c2Value = c2Value.multiply(iN);
			sum = c1Value.add(c2Value);
			if (i.equals(new BigInteger("0"))) {
				min = sum;
			} else {
				min = min.min(sum);
			}
		}
		return min;
	}
}
