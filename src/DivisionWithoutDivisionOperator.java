
public class DivisionWithoutDivisionOperator {
	public static void main(String[] args) {
		int dividend = 13, divisor = 21;
		divide(dividend, divisor);
		dividend = 43;
		divisor = -8;
		divide(dividend, divisor);
	}

	static void divide(long dividend, long divisor) {
		long sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);
		long quotient = 0;

		while (dividend >= divisor) {
			dividend -= divisor;
			++quotient;
		}
		if (sign == -1)
			quotient = -quotient;
		System.out.println("quotient - " + quotient + ", remainder - " + dividend);
	}
}