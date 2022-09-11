package code_test;

public class Solution {

	public static void main(String[] args) {
		int weights[] = { 1, 2, 3 }, solution;
		solution = snowball(weights.length, weights);
	}

	private static int snowball(int length, int[] weights) {
		int sum = 0;
		for (int i : weights) {
			sum += i;
		}
		return sum;
	}
}
