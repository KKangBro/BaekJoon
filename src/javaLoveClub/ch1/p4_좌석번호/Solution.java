package javaLoveClub.ch1.p4_좌석번호;

import java.util.*;

public class Solution {
	public int[] solution(int c, int r, int k) {
		int[] answer = new int[2];

		if (c * r < k)
			return new int[] { 0, 0 };

		boolean[][] visited = new boolean[c][r];
		int[] dx = { 0, 1, 0, -1 };
		int[] dy = { 1, 0, -1, 0 };
		int x = 0, y = 0, way = 0, nx = 0, ny = 0;

		for (int move = 1; move < k; move++) {
//			System.out.println(move + ") " + x + ", " + y);
			visited[x][y] = true;
			
			nx = x + dx[way];
			ny = y + dy[way];
			if (nx < 0 || nx >= c || ny < 0 || ny >= r || visited[nx][ny])
				way = (way + 1) % 4;

			x += dx[way];
			y += dy[way];
		}

		answer = new int[] { x + 1, y + 1 };
		return answer;
	}

	public static void main(String[] args) {
		Solution T = new Solution();
		System.out.println(Arrays.toString(T.solution(6, 5, 12)));
		System.out.println(Arrays.toString(T.solution(6, 5, 20)));
		System.out.println(Arrays.toString(T.solution(6, 5, 30)));
		System.out.println(Arrays.toString(T.solution(6, 5, 31)));
	}
}