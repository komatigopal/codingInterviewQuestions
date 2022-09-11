import java.util.Scanner;

class Main3 {
	// COMPLETE THIS FUNCTION
	private static void process(String arr) {
		System.out.println(arr);
	}

	// you do not need to edit any code below this line
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine()), max = 0;
		String book = "";
		for (int i = 0; i < n; i++) {
			String str = scanner.nextLine();
			String arra[] = str.split("pages"), test = arra[0];
			String array2[] = test.split(" ");
			int maxSize = test.length() - array2[array2.length - 1].length();
			String bookName = test.substring(0, maxSize);
			int a = Integer.parseInt(arra[1].trim());
			int b = Integer.parseInt(array2[array2.length - 1].trim());
			float percentage = a * 100 / b;
			if (max < percentage) {
				max = (int) percentage;
				book = bookName;
			}
		}
		scanner.close();
		process(book);
	}
}