package code_test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 20; i++) {
			list.add(i);
		}
		System.out.println("after inserting elements - " + list);
		List<Integer> list2 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		/*
		 * List<Integer> list9 = test(list->i)->{
		 * 
		 * return i; }).collect(Collectors.toList());
		 */
		System.out.println("after modified - " + list2);
		List<Integer> list3 = list.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println("after modified - " + list3);
		long count = list.stream().filter(i -> i % 2 == 0).count();
		System.out.println("count - " + count);
		// System.out.println(Collections.max(list,));
		Gopal gopal = (a) -> {
			System.out.println(a);
			// String k=Gopal.test();
			return a;
		};
		System.out.println(gopal.solve("komati"));
	}

}

interface Gopal {
	String solve(String a);

	default String test() {
		return "gopal";
	}
}
