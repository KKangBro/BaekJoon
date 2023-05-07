package n17484; // 진우의 달 여행 (Small)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			6 4
			5 8 5 1
			3 5 8 4
			9 77 65 5
			2 1 5 2
			5 98 1 5
			4 95 67 58
			"""; // output: 29
	
	static int N, M;
	static int[][] map;
	static int min = Integer.MAX_VALUE;
	static int[] ydir = { -1, 0, 1 };
	static int[] visited;

	public static void main(String[] args) throws IOException {
		input = new BufferedReader(new StringReader(src));

		StringTokenizer st = new StringTokenizer(input.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			map[i] = Arrays.stream(input.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}

		for (int i = 0; i < M; i++) {
			visited = new int[N];
			visited[0] = i;
			dfs(1, i, -1);
		}

		System.out.println(min);
	}

	public static void dfs(int depth, int y, int dir) {
		if (depth == N) {
			int sum = 0;
			for (int i = 0; i < N; i++) {
				sum += map[i][visited[i]];
			}

			min = min > sum ? sum : min;
			return;
		}

		for (int i = 0; i < 3; i++) {
			int dy = y + ydir[i];
			if (isValidPosition(dy) && dir != i) {
				visited[depth] = dy;
				dfs(depth + 1, dy, i);
			}
		}
	}

	public static boolean isValidPosition(int y) {
		if (y < 0 || y >= M)
			return false;
		
		return true;
	}
}
