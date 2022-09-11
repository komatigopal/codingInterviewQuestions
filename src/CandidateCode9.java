/* Read input from STDIN. Print your output to STDOUT*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateCode9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt(), t = sc.nextInt(), q = sc.nextInt(), i = 0;
		List<Integer> list = new ArrayList<Integer>();
		try {
			Integer seat;
			for (int j = 0; j < t; j++) {
				list.add(sc.nextInt());
			}
			if (t < 1) {
				while (i++ < q) {
					seat = sc.nextInt();
					if (seat <= s) {
						System.out.println("Y");
					}
				}
			} else {
				while (i++ < q) {
					seat = sc.nextInt();
					if (seat <= s) {
						if (!list.contains(seat)) {
							System.out.println("Y");
						} else {
							System.out.println("N");
						}
					} else {
						System.out.println("N");
					}
				}
			}
		} catch (Exception e) {
			while (i++ < q) {
				System.out.println("Y");
			}
		}
	}
}