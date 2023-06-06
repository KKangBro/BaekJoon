package javaLoveClub.ch2.p4_음수가있는부분수열;

public class Solution {

	public int solution(int[] nums, int m) {
		int answer = 0, sum = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			sum = nums[i];
			for (int j = i; j < nums.length; j++) {
				if (j != i)
					sum += nums[j];
//				System.out.println(sum);
				if (sum == m)
					answer += 1;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution T = new Solution();
		System.out.println(T.solution(new int[] { 2, 2, 3, -1, -1, -1, 3, 1, 1 }, 5));
		System.out.println(T.solution(new int[] { 1, 2, 3, -3, 1, 2, 2, -3 }, 5));
		System.out.println(T.solution(new int[] { 1, 2, 3, -3, 1, 2 }, 3));
		System.out.println(T.solution(new int[] { -1, 0, 1 }, 0));
		System.out.println(T.solution(new int[] { -1, -1, -1, 1 }, 0));
	}
}