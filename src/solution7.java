import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class solution7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), h = 0, solution = 0;
		String input = "", inputArray[];
		List<Float> startTime = new ArrayList<Float>();
		List<Float> endTime = new ArrayList<Float>();
		List<Float> duration = new ArrayList<Float>();
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		for (int i = 0; i < n; i++) {
			startTime = new ArrayList<Float>();
			endTime = new ArrayList<Float>();
			duration = new ArrayList<Float>();
			h = sc.nextInt();
			sc.nextLine();
			for (int j = 0; j < h; j++) {
				input = sc.nextLine();
				inputArray = input.split(" ");
				long difference = 0;
				Map<Date, Date> m = new HashMap<Date, Date>();
				try {
					Date date1 = format.parse(inputArray[1]);
					Date date2 = format.parse(inputArray[2]);
					difference = date2.getTime() - date1.getTime();
					String in[] = inputArray[1].split(":");
					startTime.add(Float.parseFloat(in[0] + "." + in[1]));
					in = inputArray[2].split(":");
					endTime.add(Float.parseFloat(in[0] + "." + in[1]));
					m.put(date1, date2);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(difference);
				float f = 0;
				if (!duration.contains(minutes)) {
					f = Float.valueOf(minutes);
					duration.add(f);
				} else {

				}
			}
			List<Float> duration2 = duration;
			Collections.sort(duration2);
			solution = solve(h, startTime, endTime, duration, duration2);
			System.out.println(solution);
		}
		sc.close();
	}

	static List<Float> temp2 = new ArrayList<Float>();

	private static int solve(int h, List<Float> startTime, List<Float> endTime, List<Float> duration,
			List<Float> duration2) {
		int solution = 0, max = 0;
		solution = solve(h, startTime, endTime, duration, duration2);
		if (max > solution) {
			max = solution;
		}
		if (temp2.size() > 0) {

		}
		return solution;
	}

	private static int solve2(int h, List<Float> startTime, List<Float> endTime, List<Float> duration,
			List<Float> duration2) {
		List<Float> temp = new ArrayList<Float>();
		List<Float> temp2 = new ArrayList<Float>();
		List<Float> tm = duration;
		int count = 0;
		for (float f : duration2) {
			float key = f;
			int index = duration.indexOf(new Float(key));
			for (int i = 0; i < h; i++) {
				if (i != index) {
					if (tm.contains(duration.get(i)) && !temp2.contains(duration.get(i))) {
						if (startTime.get(index) < endTime.get(i) && endTime.get(index) > startTime.get(i)) {
							if (key < duration.get(i)) {
								temp2.add(duration.get(i));
								count++;
							}
						}
					}
				}
			}
			temp.add(key);
		}
		return tm.size() - count;
	}
}
