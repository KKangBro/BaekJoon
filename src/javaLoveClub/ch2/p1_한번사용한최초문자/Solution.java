package javaLoveClub.ch2.p1_한번사용한최초문자;

import java.util.ArrayList;

public class Solution {
	public int solution(String s) {
		int answer = 0;

		int[] alphabet = new int[26];
		ArrayList<Character> list = new ArrayList<>();

		for (char c : s.toCharArray()) {
			if (!list.contains(c)) {
				list.add(c);
			}
			alphabet[c - 'a'] += 1;
		}
//		System.out.println(list);
//		System.out.println(Arrays.toString(alphabet));

		String target = "";
		for (Character c : list) {
			if (alphabet[c - 'a'] == 1) {
//				System.out.println(c);
				target += c;
				break;
			}
		}

		answer = target.equals("") ? -1 : s.indexOf(target) + 1;
		return answer;
	}

	public static void main(String[] args) {
		Solution T = new Solution();
		System.out.println(T.solution("statitsics"));
		System.out.println(T.solution("aabb"));
		System.out.println(T.solution("stringshowtime"));
		System.out.println(T.solution("abcdeabcdfg"));
	}
}