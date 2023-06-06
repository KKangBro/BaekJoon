package javaLoveClub.ch1.p7_비밀번호;

import java.util.HashMap;

public class Solution {

	public int solution(int[] keypad, String password) {
		HashMap<Integer, Position> hashmap = new HashMap<>();
		int x = 0, y = 0;
		for (int i = 0; i < 9; i++) {
			hashmap.put(keypad[i], new Position(x, y));
			y += 1;
			if (y > 2) {
				y = 0;
				x += 1;
			}
		}

//		for (Integer i : hashmap.keySet())
//			System.out.println(i + " : " + hashmap.get(i));

		int answer = 0;
		for (int i = 0; i < password.length() - 1; i++) {
			int xDiff = 0, yDiff = 0;
			Position one = hashmap.get(password.charAt(i) - '0');
			Position two = hashmap.get(password.charAt(i + 1) - '0');

			xDiff = Math.abs(one.x - two.x);
			yDiff = Math.abs(one.y - two.y);

			if (xDiff == 0 && yDiff == 0)
				continue;
			else if (xDiff + yDiff == 1 || (xDiff == 1 && yDiff == 1))
				answer += 1;
			else
				answer += 2;
		}

		return answer;
	}

	class Position {
		int x;
		int y;

		public Position(int x, int y) {
			this.x = x;
			this.y = y;
		}

//		@Override
//		public String toString() {
//			StringBuilder builder = new StringBuilder();
//			builder.append("Position [x=").append(x).append(", y=").append(y).append("]");
//			return builder.toString();
//		}

	}

	public static void main(String[] args) {
		Solution T = new Solution();
		System.out.println(T.solution(new int[] { 2, 5, 3, 7, 1, 6, 4, 9, 8 }, "7596218"));
		System.out.println(T.solution(new int[] { 1, 5, 7, 3, 2, 8, 9, 4, 6 }, "63855526592"));
		System.out.println(T.solution(new int[] { 2, 9, 3, 7, 8, 6, 4, 5, 1 }, "323254677"));
		System.out.println(T.solution(new int[] { 1, 6, 7, 3, 8, 9, 4, 5, 2 }, "3337772122"));
	}
}