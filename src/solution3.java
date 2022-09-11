import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), noOfContainers = 0;
		String solution = "";
		List<Integer> capacity, currentLevel;
		for (int i = 0; i < n; i++) {
			noOfContainers = sc.nextInt();
			capacity = new ArrayList<Integer>();
			currentLevel = new ArrayList<Integer>();
			for (int j = 0; j < noOfContainers; j++) {
				capacity.add(sc.nextInt());
			}
			for (int j = 0; j < noOfContainers; j++) {
				currentLevel.add(sc.nextInt());
			}
			solution = solve(capacity, currentLevel, noOfContainers);
			System.out.println(solution);
		}
		sc.close();
	}

	private static String solve(List<Integer> capacity, List<Integer> currentLevel, int n) {
		List<Integer> afterFilled = new ArrayList<Integer>();
		String solution = "";
		int spoil = 0, finalVolume = 0, filled = 0;
		for (int i = 0; i < n - 1; i++) {
			filled = currentLevel.get(i) + currentLevel.get(i + 1);
			if (filled > capacity.get(i + 1)) {
				currentLevel.set(i + 1, capacity.get(i + 1));
				spoil += filled - capacity.get(i + 1);
			} else {
				currentLevel.set(i + 1, filled);
			}
			afterFilled.add(currentLevel.get(i + 1));
		}
		finalVolume = afterFilled.get(afterFilled.size() - 1);
		solution = finalVolume + " " + spoil;
		return solution;
	}
}
