import java.util.Scanner;

public class solution4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
			solve(a, b, c, d);
		}
		sc.close();
	}

	private static void solve(int a, int b, int c, int d) {
		int topMax = 0, bottomMax = 0, noOfLinesRequired = 0, requiredFrontWhiteSpace = 0, topLeft = 0, topRight = 0,
				bottomLeft = 0, bottomRight = 0;
		if (a > b) {
			topMax = a;
		} else {
			topMax = b;
		}
		if (c > d) {
			bottomMax = c;
		} else {
			bottomMax = d;
		}
		noOfLinesRequired = topMax + bottomMax + 1;
		topLeft = topMax - a;
		topRight = topMax - b;
		for (int i = 0; i < topMax; i++) {
			if (i >= topLeft) {
				if (i == topLeft) {
					requiredFrontWhiteSpace = topMax - a;
					printValue(requiredFrontWhiteSpace, ' ');
					printValue(a + 1, '*');
				} else {
					forLeftStars(topMax, topLeft);
				}
			}
			if (i >= topRight) {
				if (i == topRight) {
					requiredFrontWhiteSpace = topMax - b;
					printValue(requiredFrontWhiteSpace, ' ');
					printValue(b, '*');
				} else {
					forRightStars(topMax, topRight);
				}
			}
			System.out.println("");
		}
		printValue(noOfLinesRequired, '*');
	}

	private static void forLeftStars(int topMax, int topRight) {
		for (int j = 0; j < topMax; j++) {
			if (j == topRight || j == topMax) {
				System.out.print('*' + " ");
			} else {
				System.out.print(' ' + " ");
			}
		}
	}

	private static void forRightStars(int topMax, int topRight) {
		for (int j = 0; j < topRight; j++) {
			if (j == 0 || j == topRight + 1) {
				System.out.print('*' + " ");
			} else {
				System.out.print(' ' + " ");
			}
		}
	}

	private static void printValue(int noOfLinesRequired, char ch) {
		for (int i = 0; i < noOfLinesRequired; i++) {
			System.out.print(ch + " ");
		}
	}
}
