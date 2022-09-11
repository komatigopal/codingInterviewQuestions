import java.util.Scanner;

public class Main {
	// List<Character> UpperCase=

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), input[] = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		sc.close();
		Main main = new Main();
		int solution[] = main.countSubarrays(input);
		for (int sol : solution) {
			System.out.print(sol + ", ");
		}
	}

	int[] countSubarrays(int[] arr) {
		int n = arr.length, solution[] = new int[n], count = 1, length = 1;
		for (int i = 0; i < n; i++) {
			count = 1;
			length = 1;
			while (i - length >= 0) {
				if (arr[i] > arr[i - length]) {
					count++;
					length++;
				} else {
					break;
				}
			}
			length = 1;
			while (i + length < n) {
				if (arr[i] > arr[i + length]) {
					count++;
					length++;
				} else {
					break;
				}
			}
			solution[i] = count;
		}
		return solution;
	}

	/*
	 * String rotationalCipher(String input, int rotationFactor) { String solution =
	 * ""; char solutionArray[] = new char[input.length()]; for (int i = 0; i <
	 * input.length(); i++) { if (Character.isAlphabetic(input.charAt(i))) { int
	 * ascii = input.charAt(i); System.out.println(input.charAt(i) + ", ascii - " +
	 * ascii); if (ascii > 96 && ascii < 123) { ascii += rotationFactor; while
	 * (ascii > 122) { ascii %= 122; ascii += 96; } } else if (ascii > 64 && ascii <
	 * 91) { ascii += rotationFactor; while (ascii > 90) { ascii %= 90; ascii += 64;
	 * } } solutionArray[i] = (char) ascii; } else if
	 * (Character.isDigit(input.charAt(i))) { int ascii = input.charAt(i); if (ascii
	 * > 47 && ascii < 58) { ascii += rotationFactor; while (ascii > 57) { ascii %=
	 * 57; ascii += 47; } solutionArray[i] = (char) ascii; } } else {
	 * solutionArray[i] = input.charAt(i); } } solution = new String(solutionArray);
	 * return solution; }
	 */

}
