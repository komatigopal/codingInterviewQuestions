import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CandidateCode2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String launchTime = sc.nextLine(), travelTime = sc.nextLine();
		sc.close();
		String resultString = solve(launchTime, travelTime);
		System.out.println(resultString);
	}

	private static String solve(String launchTime, String travelTime) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
		String launchTimeArray[] = launchTime.split(" ");
		String travelTimeArray[] = travelTime.split(" ");
		LocalTime lt = LocalTime.parse(launchTimeArray[0] + ":" + launchTimeArray[1]);
		long travelTimeInMinutes = 60 * Long.parseLong(travelTimeArray[0]);
		travelTimeInMinutes += Long.parseLong(travelTimeArray[1]);
		String result = df.format(lt.plusMinutes(travelTimeInMinutes));
		String resultArray[] = result.split(":"), resultString = resultArray[0] + " " + resultArray[1];
		return resultString;
	}
}