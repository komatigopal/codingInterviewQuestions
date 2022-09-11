import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class solution9 {

	static DateFormat f = new SimpleDateFormat("HH:mm:ss");
	static List<Long> list = new ArrayList<Long>();
	// static int mattressCount;

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String solution, input, splitArray[];
		int t = sc.nextInt(), n;
		long start[], end[], seconds;
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date reference = dateFormat.parse("00:00:00");
		Date date;
		for (int i = 0; i < t; i++) {
			n = sc.nextInt();
			sc.nextLine();
			start = new long[n];
			end = new long[n];
			list = new ArrayList<Long>();
			for (int j = 0; j < n; j++) {
				input = sc.nextLine();
				splitArray = input.split(" ");
				date = dateFormat.parse(splitArray[0]);
				seconds = (date.getTime() - reference.getTime()) / 1000L;
				start[j] = seconds;
				date = dateFormat.parse(splitArray[1]);
				seconds = (date.getTime() - reference.getTime()) / 1000L;
				end[j] = seconds;
			}
			solution = solve(n, start, end);
			System.out.println(solution);
		}
		sc.close();
	}

	private static String findHours(int n, int mattressCount, List<Long> startInList, List<Long> endInList) {
		System.out.println("startInList - " + startInList);
		System.out.println("endInList - " + endInList);
		String solution = "";
		int count = 0;
		for (int i = 0; i < n; i++) {
			count = 0;
			long min = 0l;
			long startI = startInList.get(i), endI = endInList.get(i);
			for (int j = i + 1; j < n; j++) {
				long startJ = startInList.get(j), endJ = endInList.get(j);
				if (startJ < endI) {
					System.out.println("count - " + count + ", a[i] - " + startI + ", e[i] - " + endI);
					System.out.println("countddd - " + count + ", a[j] - " + startJ + ", e[j] - " + endJ);
					long dif1 = endI - startJ;
					long dif2 = endJ - startJ;
					if (count == 0) {
						if (dif1 < dif2) {
							min = dif1;
						} else {
							min = dif2;
						}
					} else {
						if (dif1 < dif2 && min > dif1) {
							min = dif1;
						} else if (dif1 > dif2 && min > dif2) {
							min = dif2;
						}
					}
					count++;
					if (count == mattressCount - 1) {
						list.add(min);
					}
				}
			}
		}
		System.out.println("list - " + list);
		return solution;
	}

	/*
	 * private static String getString(String s1, String s2) { String answer = "";
	 * LocalTime t1 = LocalTime.parse(s1); LocalTime t2 = LocalTime.parse(s2);
	 * Duration d = Duration.between(t2, t1); answer = toHHMMSS(d);
	 * System.out.println(answer); return answer; }
	 * 
	 * private static String toHHMMSS(Duration d) { long hours = d.toHours(); int
	 * minutes = (int) (d.toMinutes() % 60); int secs = (int) (d.getSeconds() % 60);
	 * 
	 * return hours + ":" + minutes + ":" + secs; }
	 */

	private static String solve(int n, long[] start, long[] end) {
		String solution = "";
		List<Long> startInList = new ArrayList<Long>();
		for (int i = 0; i < n; i++) {
			startInList.add(start[i]);
		}
		Arrays.sort(start);
		List<Long> endInList = new ArrayList<Long>();
		for (int i = 0; i < n; i++) {
			int index = startInList.indexOf(start[i]);
			endInList.add(end[index]);
		}
		Collections.sort(startInList);
		Arrays.sort(end);
		int mattresseNeeded = 1, mattressCount = 1;
		int i = 1, j = 0;
		while (i < n && j < n) {
			if (start[i] <= end[j]) {
				mattresseNeeded++;
				i++;
				if (mattresseNeeded > mattressCount)
					mattressCount = mattresseNeeded;
			} else {
				mattresseNeeded--;
				j++;
			}
		}
		solution = "result - " + mattressCount;
		// mattressCount = result;
		solution += findHours(n, mattressCount, startInList, endInList);
		return solution;
	}
}