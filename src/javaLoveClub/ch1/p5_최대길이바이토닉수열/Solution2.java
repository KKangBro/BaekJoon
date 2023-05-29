package javaLoveClub.ch1.p5_최대길이바이토닉수열;

import java.util.Stack;

public class Solution2 {
	static int rst;
	static Stack<Character> stack;

	public int solution(int[] nums) {
		int answer = 0;
		rst = 0;
		stack = new Stack<>();

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] < nums[i + 1]) {
				if (!stack.isEmpty() && stack.peek() == '-')
					calc();
				stack.push('+');
			} else if (nums[i] > nums[i + 1]) {
				if (stack.isEmpty())
					continue;
				stack.push('-');
			} else if (nums[i] == nums[i + 1]) {
				calc();
			}
		}
		calc();

		answer = rst;
		return answer;
	}

	private void calc() {
		if (stack.size() < 2)
			return;

		String str = "";
		for (Character c : stack)
			str += c;
//		System.out.println(str);

		if (str.charAt(0) == '+' && str.charAt(str.length() - 1) == '-') {
//			System.out.println("부분결과: " + (str.length() + 1));
			rst = Math.max(rst, str.length() + 1);
		}
		stack.clear();
	}

	public static void main(String[] args) {
		Solution2 T = new Solution2();
		System.out.println(T.solution(new int[] { 1, 3, 2, 5, 7, 4, 2, 5, 1 })); // output: 5
		System.out.println(T.solution(new int[] { 1, 1, 2, 3, 5, 7, 4, 3, 1, 2 })); // output: 8
		System.out.println(T.solution(new int[] { 3, 2, 1, 3, 2, 4, 6, 7, 3, 1 })); // output: 6
		System.out.println(T.solution(new int[] { 1, 3, 1, 2, 1, 5, 3, 2, 1, 1 })); // output: 5

		System.out.println(T.solution(new int[] { 2, 2, 2, 2, 2 })); // output: 0
		System.out.println(T.solution(new int[] { 1, 2, 3, 4, 4, 2, 3, 1 })); // output: 3
		System.out.println(T.solution(new int[] { 1, 2, 1, 2, 3, 2, 1 })); // output: 5
	}
}