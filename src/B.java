
public class B extends A {

	private B() {
		super.a = 5;
		this.a = 7;
	}

	private B(String a) {
		super.a = 5;
		this.a = 7;
	}

	public B(int a) {
		new B("gopal");
		new B();
		super.a = 5;
		this.a = 7;
	}

	public static String test(String aa, int from, int to) {
		char array[] = aa.toCharArray();
		System.out.println(array);
		System.out.println(from);
		System.out.println(to);
		return String.copyValueOf(array, from, to);
	}

	public static void main(String[] args) {
		String name = "gopalkomati";
		System.out.println(name.length());
		String substr = test(name, 5, name.length());
		System.out.println("substr - " + substr);
	}

	/*
	 * public B() {
	 * 
	 * }
	 */
}
