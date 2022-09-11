
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/** * * A simple example to send HTTP request from Java * */
public class HttpDemo {
	public static void main(String args[]) throws IOException {
		String team = "Barcelona";
		int year = 2011, count = getTotalGoals(team, year);
		System.out.println("final count - " + count);
		team = "Chelsea";
		year = 2014;
		count = getTotalGoals(team, year);
		System.out.println("final count - " + count);

	}

	public static int getTotalGoals(String team, int year) {
		int count = 0, getPages = 0;
		String link = "https://jsonmock.hackerrank.com/api/football_matches?year=";
		String link1 = link + year + "&team1=" + team;
		String link2 = link + year + "&team2=" + team;
		try {
			URL url = new URL(link1);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			String splitString = "\"team1goals\":\"";
			getPages = getPages(con);
			for (int i = 1; i <= getPages; i++) {
				String link3 = link1 + "&page=" + i;
				System.out.println("link3 + - " + link3);
				url = new URL(link3);
				con = (HttpURLConnection) url.openConnection();
				con.setRequestMethod("GET");
				count += solve(con, splitString);
			}
			splitString = "\"team2goals\":\"";
			getPages = getPages(con);
			for (int i = 1; i <= getPages; i++) {
				String link3 = link2 + "&page=" + i;
				System.out.println("link4 + - " + link3);
				url = new URL(link3);
				con = (HttpURLConnection) url.openConnection();
				con.setRequestMethod("GET");
				count += solve(con, splitString);
			}
		} catch (IOException e) {
			count = -1;
			e.printStackTrace();
		}
		return count;
	}

	private static int getPages(HttpURLConnection con2) {
		int count = 0;
		try {
			BufferedReader in2 = new BufferedReader(new InputStreamReader(con2.getInputStream()));
			String inputLine2, output = "";
			while ((inputLine2 = in2.readLine()) != null) {
				System.out.println(inputLine2);
				if (inputLine2.contains("\"total_pages\":")) {
					String array[] = inputLine2.split("\"total_pages\":");
					output = array[1].split(",")[0];
					System.out.println(output);
					count = Integer.parseInt(output);
					break;
				}
			}
		} catch (IOException e) {
			count = -1;
			e.printStackTrace();
		}
		return count;
	}

	private static int solve(HttpURLConnection con2, String splitString) {
		int count = 0;
		try {
			BufferedReader in2 = new BufferedReader(new InputStreamReader(con2.getInputStream()));
			String inputLine2, output = "";
			while ((inputLine2 = in2.readLine()) != null) {
				System.out.println(inputLine2);
				if (inputLine2.contains("\"data\":\\[")) {
					String array[] = inputLine2.split("\"data\":\\[");
					output = array[1].substring(0, array[1].length() - 2);
					System.out.println(output);
					break;
				}
			}
			String array2[] = output.split(splitString);
			for (int i = 1; i < array2.length; i++) {
				String s = array2[i];
				System.out.println(s);
				s = s.split("\"")[0];
				count += Integer.parseInt(s);
			}
			System.out.println("count -" + count);
		} catch (IOException e) {
			count = -1;
			e.printStackTrace();
		}
		return count;
	}
}