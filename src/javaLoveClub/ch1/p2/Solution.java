package javaLoveClub.ch1.p2;

import java.util.*;

class Solution {
	// 우 -> 하 -> 좌 -> 상 -> 우 -> ...
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

	public int[] solution(int[][] board, int k) {
		int[] answer = new int[2];

		int leng = board.length;
		int x = 0, y = 0;
		int way = 0;

		for (int i = 1; i <= k; i++) {
			int nx = x + dx[way];
			int ny = y + dy[way];

			if (nx < 0 || nx >= leng || ny < 0 || ny >= leng || board[nx][ny] == 1) {
				way = (way + 1) % 4;
				continue;
			}

			x = nx;
			y = ny;
//			System.out.println(i + ") " + x + ", " + y);
		}

		answer = new int[] { x, y };
		return answer;
	}

	public static void main(String[] args) {
		Solution T = new Solution();
		int[][] arr1 = { { 0, 0, 0, 0, 0 }, { 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1 },
				{ 0, 0, 0, 0, 0 } };
		System.out.println(Arrays.toString(T.solution(arr1, 10)));
		int[][] arr2 = { { 0, 0, 0, 1, 0, 1 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 1 }, { 1, 1, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
		System.out.println(Arrays.toString(T.solution(arr2, 20)));
		int[][] arr3 = { { 0, 0, 1, 0, 0 }, { 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 1 },
				{ 0, 0, 0, 0, 0 } };
		System.out.println(Arrays.toString(T.solution(arr3, 25)));

	}
}