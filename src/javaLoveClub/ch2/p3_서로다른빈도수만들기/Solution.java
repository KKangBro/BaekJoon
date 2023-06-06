package javaLoveClub.ch2.p3_서로다른빈도수만들기;

import java.util.HashMap;

public class Solution {

	public int solution(String s) {
		HashMap<Character, Integer> hashmap = new HashMap<>();
		for (Character c : s.toCharArray())
			hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);

//		for (Character c : hashmap.keySet())
//			System.out.println(c + " : " + hashmap.get(c));

		int answer = 0, cnt = 0;
		boolean[] check = new boolean[hashmap.size()];
		for (Character c : hashmap.keySet()) {
			cnt = hashmap.get(c) - 1;
			while (cnt >= 0) {
				if (!check[cnt]) {
					check[cnt] = true;
					break;
				} else {
					cnt -= 1;
					answer += 1;
				}
			}
//			System.out.println(Arrays.toString(check));
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution T = new Solution();
		System.out.println(T.solution("aaabbbcc"));
		System.out.println(T.solution("aaabbc"));
		System.out.println(T.solution("aebbbbc"));
		System.out.println(T.solution("aaabbbcccde"));
		System.out.println(T.solution("aaabbbcccdddeeeeeff"));
	}
}