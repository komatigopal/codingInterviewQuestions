import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Singer {
	public static void main(String[] args) {
		List<List<Integer>> allLocations = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3000);
		allLocations.add(list);

		list = new ArrayList<Integer>();
		list.add(2);
		list.add(5000);
		allLocations.add(list);

		list = new ArrayList<Integer>();
		list.add(3);
		list.add(7000);
		allLocations.add(list);

		list = new ArrayList<Integer>();
		list.add(4);
		list.add(10000);
		allLocations.add(list);

		int numRestaurants = 10000;

		List<List<Integer>> allLocations2 = new ArrayList<List<Integer>>();
		list = new ArrayList<Integer>();
		list.add(1);
		list.add(2000);
		allLocations2.add(list);

		list = new ArrayList<Integer>();
		list.add(2);
		list.add(3000);
		allLocations2.add(list);

		list = new ArrayList<Integer>();
		list.add(3);
		list.add(4000);
		allLocations2.add(list);

		list = new ArrayList<Integer>();
		list.add(4);
		list.add(5000);
		allLocations2.add(list);

		List<List<Integer>> solution = new ArrayList<List<Integer>>();

		solution = routePairs(numRestaurants, allLocations, allLocations2);
		System.out.println(solution);

		List<List<Integer>> allLocations3 = new ArrayList<List<Integer>>();
		list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		allLocations3.add(list);

		list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		allLocations3.add(list);

		list = new ArrayList<Integer>();
		list.add(1);
		list.add(-1);
		allLocations3.add(list);
		numRestaurants = 2;

		solution = findRestaurants(allLocations3, numRestaurants);
		System.out.println("No of Restuarents - " + solution);
	}

	public static List<List<Integer>> routePairs(int maxTravelDist, List<List<Integer>> forwardRouteList,
			List<List<Integer>> returnRouteList) {
		List<List<Integer>> solution = new ArrayList<List<Integer>>();
		int forwardRoute = 0, returnRoute = 0, distance = 0, initial = 0, x = 1, y = 1;
		boolean status = false;
		for (List<Integer> list2 : returnRouteList) {
			returnRoute = list2.get(1);
			initial = 0;
			List<Integer> list3 = new ArrayList<Integer>();
			x = 1;
			for (List<Integer> list : forwardRouteList) {
				forwardRoute = list.get(1);
				distance = forwardRoute + returnRoute;
				if (initial < distance && distance <= maxTravelDist) {
					initial = distance;
					list3 = new ArrayList<Integer>();
					list3.add(x);
					list3.add(y);
					if (distance == maxTravelDist) {
						if (!status) {
							status = true;
							solution = new ArrayList<List<Integer>>();
							solution.add(list3);
						} else {
							if (!solution.contains(list3) && !list3.isEmpty()) {
								solution.add(list3);
							}
						}
					}
				}
				x++;
			}
			y++;
		}
		Collections.sort(solution, new Comparator<List<Integer>>() {
			@Override
			public int compare(List<Integer> o1, List<Integer> o2) {
				return o1.get(0).compareTo(o2.get(0));
			}
		});
		return solution;
	}

	public static List<List<Integer>> findRestaurants(List<List<Integer>> allLocations, int numRestaurants) {
		List<List<Integer>> solution = new ArrayList<List<Integer>>();
		double distance = 0, x = 0, y = 0;
		HashMap<Double, List<Integer>> hashMap = new HashMap<Double, List<Integer>>();
		for (List<Integer> list : allLocations) {
			x = list.get(0);
			y = list.get(1);
			distance = Math.sqrt((x * x) + (y * y));
			hashMap.put(distance, list);
		}
		Map<Double, List<Integer>> map = hashMap.entrySet().stream()
				.sorted(Map.Entry.<Double, List<Integer>>comparingByKey()).limit(numRestaurants)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		for (Map.Entry<Double, List<Integer>> entry : map.entrySet()) {
			List<Integer> list = entry.getValue();
			solution.add(list);
		}
		return solution;
	}

	/*
	 * private static HashMap sortKeys(HashMap map) { List list = new
	 * LinkedList(map.entrySet()); Collections.sort(list, new Comparator() { public
	 * int compare(Object o1, Object o2) { return ((Comparable) ((Map.Entry)
	 * (o1)).getKey()).compareTo(((Map.Entry) (o2)).getKey()); } }); HashMap
	 * sortedHashMap = new LinkedHashMap(); for (Iterator it = list.iterator();
	 * it.hasNext();) { Map.Entry entry = (Map.Entry) it.next();
	 * sortedHashMap.put(entry.getKey(), entry.getValue()); } return sortedHashMap;
	 * }
	 */
}
