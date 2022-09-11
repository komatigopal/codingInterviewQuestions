package code_test;

import java.util.ArrayList;

public class InterviewBit {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		b.add(list);

		list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		b.add(list);
		System.out.println("Initial List printing ");
		for (ArrayList<Integer> l : b) {
			for (int a : l) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		rotate(b);
	}

	public static void rotate(ArrayList<ArrayList<Integer>> a) {
		ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();
		int n = a.size(), m = a.get(0).size();
		System.out.println("n - " + m);
		ArrayList<Integer> list;
		for (int i = 0; i < n; i++) {
			list = new ArrayList<Integer>();
			for (int j = 0; j < m; j++) {
				list.add(a.get(j).get(i));
			}
			b.add(list);
		}
		for (int j = 0; j < n; j++) {
			for (int i = m - 1; i >= 0; i--) {
				System.out.print(b.get(j).get(i) + " ");
			}
			System.out.println();
		}
	}
}