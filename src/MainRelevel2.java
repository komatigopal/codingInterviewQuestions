import java.util.Arrays;
import java.util.Scanner;

public class MainRelevel2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(a);
		int sum = -1;
		if (n > 3) {
			sum = a[0] + a[1] + a[2];
		}
		System.out.println(sum);
	}

}
