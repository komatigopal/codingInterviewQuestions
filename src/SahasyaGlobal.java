import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SahasyaGlobal {
	public static void main(String[] args) {
		List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "gopal");
		mapList.add(map);
		map = new HashMap<String, String>();
		map.put("name", "gopal");
		mapList.add(map);
		map = new HashMap<String, String>();
		map.put("name", "gopigopi");
		mapList.add(map);
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		for (Map<String, String> map1 : mapList) {
			String name = map1.get("name").toString();
			int count = 1;
			if (map2.containsKey(name)) {
				count = map2.get(name) + 1;
			}
			map2.put(name, count);
		}
		System.out.println("map2 - " + map2);
	}
}