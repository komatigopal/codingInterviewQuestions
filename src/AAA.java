import java.util.Scanner;

public class AAA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "", tS = "";
		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				s = sc.nextLine();
			} else {
				tS = sc.nextLine();
				sc.close();
				break;
			}
		}
		String sArray[] = s.split(" "), tSArray[] = tS.split(" ");
		long h = Long.parseLong(sArray[0]), m = Long.parseLong(sArray[1]), tH = Long.parseLong(tSArray[0]),
				tM = Long.parseLong(tSArray[1]);
		h = h * 60 + m;
		h += tH * 60 + tM;
		long fH = h / 60, fM = h % 60;
		System.out.println(fH + " " + fM);
	}

}
