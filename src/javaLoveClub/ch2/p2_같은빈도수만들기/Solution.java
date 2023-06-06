package javaLoveClub.ch2.p2_같은빈도수만들기;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
	public int[] solution(String s) {
		int[] answer = new int[5];

		HashMap<Character, Integer> hashmap = new HashMap<>();
		for (Character c : s.toCharArray())
			hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);

//		for (Character c : hashmap.keySet())
//			System.out.println(c + " : " + hashmap.get(c));

		Integer max = Collections.max(hashmap.values());
		for (int i = 0; i < 5; i++) {
			char c = (char) ('a' + i);
			answer[i] = max - (hashmap.get(c) == null ? 0 : hashmap.get(c));
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution T = new Solution();
		System.out.println(Arrays.toString(T.solution("aaabc")));
		System.out.println(Arrays.toString(T.solution("aabb")));
		System.out.println(Arrays.toString(T.solution("abcde")));
		System.out.println(Arrays.toString(T.solution("abcdeabc")));
		System.out.println(Arrays.toString(T.solution("abbccddee")));
	}
}