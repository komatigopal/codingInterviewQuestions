import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FedEx {

	public static void main(String[] args) {
		/*
		 * List<String> list = new ArrayList<String>(); list.add("green");
		 * list.add("red"); list.add("black"); list.add("white"); Map<String, Integer>
		 * map = new HashMap<String, Integer>(); for (String colour : list) {
		 * map.put(colour, colour.length()); }
		 */
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(8);
		list.add(10);
		Collections.sort(list);
		System.out.println("3rd max value - " + list.get(2));
	}

}
