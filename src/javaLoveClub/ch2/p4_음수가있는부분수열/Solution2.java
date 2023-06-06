package javaLoveClub.ch2.p4_음수가있는부분수열;

import java.util.HashMap;

public class Solution2 {

	public int solution(int[] nums, int m) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int answer = 0, sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];

			if (hmap.containsKey(sum - m))
				answer += hmap.get(sum - m);
			else if (sum == m)
				answer += 1;

			hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
		}

//		for (Integer i : hmap.keySet()) {
//			System.out.println(i + " : " + hmap.get(i));
//		}

		return answer;
	}

	public static void main(String[] args) {
		Solution2 T = new Solution2();
		System.out.println(T.solution(new int[] { 2, 2, 3, -1, -1, -1, 3, 1, 1 }, 5));
		System.out.println(T.solution(new int[] { 1, 2, 3, -3, 1, 2, 2, -3 }, 5));
		System.out.println(T.solution(new int[] { 1, 2, 3, -3, 1, 2 }, 3));
		System.out.println(T.solution(new int[] { -1, 0, 1 }, 0));
		System.out.println(T.solution(new int[] { -1, -1, -1, 1 }, 0));
	}
}