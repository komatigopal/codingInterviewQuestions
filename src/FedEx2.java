import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FedEx2 {

	public static void main(String[] args) {
		/*
		 * String s = "aabbccca"; solve(s);
		 */
		// list & arraylisyt combo
		List<Employee123> list = new ArrayList<Employee123>();
		Employee123 emp = new Employee123("123", "name", 1000);
		list.add(emp);
		emp = new Employee123("223", "name2", 2000);
		list.add(emp);
		emp = new Employee123("323", "name3", 3000);
		list.add(emp);
		long conditionSal = 2000;
		List<Employee123> list2 = (a) -> {
			list2 = new ArrayList<Employee123>();
			for (Employee123 emp1 : list) {
				if (emp1.getSalary() >= conditionSal) {
					list2.add(emp1);
				}
			}
		};
		System.out.println(list2);
	}

	private static List<Employee123> filter(List<Employee123> list, long conditionSal) {
		List<Employee123> list2 = new ArrayList<Employee123>();
		for (Employee123 emp : list) {
			if (emp.getSalary() >= conditionSal) {
				list2.add(emp);
			}
		}
		return list2;
	}

	private static void solve(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : s.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

}
