import java.util.Set;
import java.util.TreeSet;

public class Test1234 {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 5, 3, 3, 2, 7 };
		Set<Integer> evenSet = new TreeSet<Integer>();
		Set<Integer> oddSet = new TreeSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				evenSet.add(array[i]);
			} else {
				oddSet.add(array[i]);
			}
		}

		System.out.println(evenSet + ", " + oddSet);
	}

}
