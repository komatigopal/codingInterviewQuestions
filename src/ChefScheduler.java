import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ChefScheduler {

	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> requests = new HashMap<>();
		requests.put("ada", new ArrayList<>(Arrays.asList(new String[] { "mon", "tue", "wed", "fri", "sat", "sun" })));
		requests.put("emma", new ArrayList<>(Arrays.asList(new String[] { "tue", "wed", "thu", "sun" })));
		requests.put("remy", new ArrayList<>(Arrays.asList(new String[] { "mon", "sat" })));
		requests.put("zach", new ArrayList<>(Arrays.asList(new String[] {})));
		boolean status = ChefScheduler.schedulable(requests);
		System.out.println("status - " + status);
	}

	public static boolean schedulable(HashMap<String, ArrayList<String>> requests) {
		boolean status = false;
		int totalShifts = 2 * 7;
		Set<String> keys = requests.keySet();
		List<String> list = new ArrayList<String>();
		if (keys.size() > 2) {
			return status;
		}
		for (Map.Entry<String, ArrayList<String>> pair : requests.entrySet()) {
			String name = pair.getKey();
			ArrayList<String> nameList = pair.getValue();
			
		}
		return status;
	}
}
