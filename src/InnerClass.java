
public class InnerClass extends OuterClass {
	int b;

	public void main() {
		System.out.println(b);
	}

	public static void main(String[] args) {
		/*
		 * OuterClass xyz = new InnerClass(); // xyz.b = 5; xyz.a = 2;
		 */
		int a[] = { 4, 2, 5, 3, 6, 1 }, j;
		for (int i = 1; i < a.length; i++) {
			j = i;
			do {
				int temp = a[j];
				a[j] = a[j - 1];
				a[j - 1] = temp;
				j = j - 1;
			} while (j > 0 && a[j] < a[j - 1]);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
