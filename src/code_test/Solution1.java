package code_test;
/* Problem Name is &&& Group Anagrams &&& PLEASE DO NOT REMOVE THIS LINE. */

/**
 * Instructions to candidate.
 *  1) Given a list of words, group them by anagrams
 *     Input: List of "cat", "dog", "god"
 *     Output: A Set of Sets of anagrams: {{'cat'}, {'dog', 'god'}}
 *     ogd
 *  2) Run this code in the REPL to observe its behaviour. The
 *     execution entry point is main().
 *  3) Consider adding some additional tests in doTestsPass().
 *  4) Implement the AnagramSolution group() method correctly.
 *  5) If time permits, try to improve your implementation.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */
public class Solution1 {

	/**
	 * A means for grouping words by anagram (same letters irrespective of order)
	 */
	@FunctionalInterface
	interface AnagramSolution {
		Set<Set<String>> group(List<String> words);
	}

//cat, dog, god
	/*
	 * public class test implements AnagramSolution {
	 * 
	 * public Set<Set<String>> group(List<String> words) {
	 * 
	 * }
	 * 
	 * private boolean solution(String s, String s1) { boolean status = true; for
	 * (char ch : s1.toCharArray()) { if (!s.contains(String.valueOf(ch))) { status
	 * = false; return status; } } return status; }
	 * 
	 * }
	 */

	/**
	 * public static boolean doTestsPass() Returns true if all tests pass. Otherwise
	 * returns false
	 */
	public static boolean doTestsPass() {
		// todo: implement more tests, please
		// feel free to make testing more elegant

		// given some words
		List<String> words = Arrays.asList("cat", "dog", "god", "act", "good");

		// todo : and a solution to the problem
		// AagramSolution sol = new test();
		AnagramSolution sol = (wordList) -> {
			Set<Set<String>> resultSet = new HashSet<Set<String>>();
			for (String word : wordList) {
				Set<String> set = new HashSet<String>();
				for (String s1 : words) {
					if (!word.equals(s1)) {
						boolean status = false;
						if (word.length() == s1.length()) {
							status = solution(word, s1);
							if (status) {
								set.add(s1);
							}
						}
					}
					set.add(word);
				}
				resultSet.add(set);
			}
			System.out.println("resultSet - " + resultSet);
			return resultSet;
		};

		// when grouped
		Set<Set<String>> grouped = sol.group(words);

		// we expect god and dog to be identified as anagrams, whilst cat isn't
		boolean result = true;
		result = result && grouped.contains(new HashSet<>(Arrays.asList("cat", "act")));
		result = result && grouped.contains(new HashSet<>(Arrays.asList("dog", "god")));
		result = result && grouped.contains(new HashSet<>(Arrays.asList("good")));
		return result;
	};

	private static boolean solution(String s, String s1) {
		boolean status = true;
		for (char ch : s1.toCharArray()) {
			if (!s.contains(String.valueOf(ch))) {
				status = false;
				return status;
			}
		}
		return status;
	}

	/**
	 * Execution entry point.
	 */
	public static void main(String[] args) {
		if (doTestsPass()) {
			System.out.println("All tests pass");
		} else {
			System.out.println("There are test failures");
		}

	}
}
