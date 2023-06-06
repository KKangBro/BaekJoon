package javaLoveClub.ch1.p8_회의실만남;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
	public int[] solution(int[] enter, int[] exit) {
		int[] answer = new int[enter.length];
		HashSet<Integer> set = new HashSet<>();

		int idx = 0;
		for (int i = 0; i < enter.length; i++) {
			while (set.remove(exit[idx]))
				idx += 1;

			int in = enter[i];
			answer[in - 1] = set.size();
			for (Integer num : set)
				answer[num - 1] += 1;
			set.add(in);
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution T = new Solution();
		System.out.println(Arrays.toString(T.solution(new int[] { 1, 2, 3, 4 }, new int[] { 2, 4, 1, 3 })));
		System.out.println(Arrays.toString(T.solution(new int[] { 1, 2, 5, 3, 4 }, new int[] { 2, 3, 1, 4, 5 })));
		System.out.println(Arrays.toString(T.solution(new int[] { 1, 3, 2, 4, 5, 7, 6, 8 }, new int[] { 2, 3, 5, 6, 1, 4, 8, 7 })));
		System.out.println(Arrays.toString(T.solution(new int[] { 1, 4, 7, 2, 3, 5, 6 }, new int[] { 5, 2, 6, 1, 7, 3, 4 })));
		System.out.println(Arrays.toString(T.solution(new int[] { 1, 4, 2, 3 }, new int[] { 2, 1, 4, 3 })));
	}
}