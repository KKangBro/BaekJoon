package my; // https://youtu.be/7C9RgOcvkvo

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 음료수얼려먹기 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			4 5
			00110
			00011
			11111
			00000
			"""; // output: 3
	static int N, M;
	static int[][] map;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		StringTokenizer st = new StringTokenizer(input.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];

		for (int i = 0; i < N; i++) {
			String str = input.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}

		int rst = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (dfs(i, j)) {
					rst += 1;
				}
			}
		}

		System.out.println(rst);
	}

	private static boolean dfs(int x, int y) {
		if (x < 0 || y < 0 || x >= N || y >= M)
			return false;

		if (map[x][y] == 0) {
			map[x][y] = 1;

			for (int i = 0; i < 4; i++) {
				dfs(x + dx[i], y + dy[i]);
			}
			return true;
		}
		return false;
	}
}
