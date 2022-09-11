import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NagarajAnna2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(), K;
		BigInteger N, answer;
		for (int i = 0; i < T; i++) {
			N = sc.nextBigInteger();
			K = sc.nextInt();
			if (K == 0) {
				answer = N;
			} else {
				answer = solve(N, K);
			}
			System.out.println("answer - " + answer);
		}
		sc.close();
	}

	private static BigInteger solve(BigInteger n, int k) {
		BigInteger answer = BigInteger.valueOf(k), count = BigInteger.valueOf(0), temp;
		boolean maxDifferenceIsEqualToK = false;
		for (BigInteger j = BigInteger.valueOf(k + 1); count.compareTo(n) == -1;) {
			maxDifferenceIsEqualToK = false;
			maxDifferenceIsEqualToK = checkMaxDifferenceIsEqualToK(j, k);
			if (maxDifferenceIsEqualToK) {
				answer = j;
				count = count.add(BigInteger.valueOf(1));
			}
			temp = j.add(BigInteger.valueOf(1));
			j = temp;
		}
		return answer;
	}

	private static boolean checkMaxDifferenceIsEqualToK(BigInteger j, int k) {
		boolean maxDifferenceIsEqualToK = false;
		List<Integer> digits = getDigitsFromNumber(j);
		List<Integer> differences = getDifferences(digits);
		int size = differences.size();
		Collections.sort(differences);
		if (differences.get(size - 1) == k) {
			maxDifferenceIsEqualToK = true;
		}
		return maxDifferenceIsEqualToK;
	}

	private static List<Integer> getDifferences(List<Integer> digits) {
		List<Integer> differences = new ArrayList<Integer>();
		int size = digits.size(), difference;
		if (digits.size() == 1) {
			differences.add(digits.get(0));
		} else {
			for (int i = 0; i < size; i++) {
				for (int j = i + 1; j < size; j++) {
					difference = digits.get(i) - digits.get(j);
					if (difference < 0) {
						difference *= -1;
					}
					differences.add(difference);
				}
			}
		}
		return differences;
	}

	private static List<Integer> getDigitsFromNumber(BigInteger j) {
		List<Integer> digits = new ArrayList<Integer>();
		BigInteger digit;
		while (j.compareTo(BigInteger.valueOf(0)) == 1) {
			digit = j.remainder(BigInteger.valueOf(10));
			digits.add(digit.intValue());
			j = j.divide((BigInteger.valueOf(10)));
		}
		return digits;
	}
}