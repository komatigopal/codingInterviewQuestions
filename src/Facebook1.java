import java.util.Scanner;

public class Facebook1 {
	// List<Character> UpperCase=

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(), solution = "";
		int rotationFactor = sc.nextInt();
		sc.close();
		Facebook1 main = new Facebook1();
		solution = main.rotationalCipher(input, rotationFactor);
		System.out.println("solution - " + solution);
	}

	String rotationalCipher(String input, int rotationFactor) {
		String solution = "";
		char solutionArray[] = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			if (Character.isAlphabetic(input.charAt(i))) {
				int ascii = input.charAt(i);
				System.out.println(input.charAt(i) + ", ascii - " + ascii);
				if (ascii > 96 && ascii < 123) {
					ascii += rotationFactor;
					while (ascii > 122) {
						ascii %= 122;
						ascii += 96;
					}
				} else if (ascii > 64 && ascii < 91) {
					ascii += rotationFactor;
					while (ascii > 90) {
						ascii %= 90;
						ascii += 64;
					}
				}
				solutionArray[i] = (char) ascii;
			} else if (Character.isDigit(input.charAt(i))) {
				int ascii = input.charAt(i);
				if (ascii > 47 && ascii < 58) {
					ascii += rotationFactor;
					while (ascii > 57) {
						ascii %= 57;
						ascii += 47;
					}
					solutionArray[i] = (char) ascii;
				}
			} else {
				solutionArray[i] = input.charAt(i);
			}
		}
		solution = new String(solutionArray);
		return solution;
	}

}
