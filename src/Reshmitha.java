public class Reshmitha {
	static int c = 1;

	public static void main(String[] args) {
		System.out.println("before c - " + c);
		test();
		System.out.println("after c - " + c);
	}

	private static void test() {
		c = 11;
	}

}
