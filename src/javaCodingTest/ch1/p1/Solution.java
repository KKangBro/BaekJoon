package javaCodingTest.ch1.p1;

import java.util.*;

class Solution {
	public char[] solution(int n, int[][] ladder) {
		char[] answer = new char[n];

		ArrayList<Line>[] lines = new ArrayList[ladder.length];
		for (int i = 0; i < lines.length; i++) {
			lines[i] = new ArrayList<>();
			for (int num : ladder[i]) {
				lines[i].add(new Line(num, num + 1));
			}
		}

		for (int i = 0; i < lines.length; i++) {
			System.out.println(i + " : " + lines[i]);
		}

		return answer;
	}

	class Line {
		int s;
		int e;

		public Line(int s, int e) {
			this.s = s;
			this.e = e;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Line [s=").append(s).append(", e=").append(e).append("]");
			return builder.toString();
		}

	}

	public static void main(String[] args) {
		Solution T = new Solution();
		System.out.println(Arrays.toString(T.solution(5, new int[][] { { 1, 3 }, { 2, 4 }, { 1, 4 } })));
//		System.out.println(Arrays.toString(T.solution(7, new int[][] { { 1, 3, 5 }, { 1, 3, 6 }, { 2, 4 } })));
//		System.out.println(Arrays.toString(T.solution(8, new int[][] { { 1, 5 }, { 2, 4, 7 }, { 1, 5, 7 }, { 2, 5, 7 } })));
//		System.out.println(Arrays.toString(T.solution(12, new int[][] { { 1, 5, 8, 10 }, { 2, 4, 7 }, { 1, 5, 7, 9, 11 }, { 2, 5, 7, 10 }, { 3, 6, 8, 11 } })));
	}
}