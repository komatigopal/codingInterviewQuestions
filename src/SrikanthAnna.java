import java.util.ArrayList;
import java.util.List;

public class SrikanthAnna {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Integer n[] = { 1, 2, 2, 5, 3, 5, 4 };
		for (int i = 0; i < n.length; i++) {
			if (!list.contains(n[i])) {
				list.add(n[i]);
			}
		}
		System.out.println(list);
	}
}