package my.dfs; // https://youtu.be/7C9RgOcvkvo

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탈출 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static String src = """
			5 6
			101010
			111111
			000001
			111111
			111111
			"""; // output: 10
	static int N, M;
	static int[][] map;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		StringTokenizer st = new StringTokenizer(input.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];

		for (int i = 0; i < N; i++) {
			String temp = input.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = temp.charAt(j) - '0';
			}
		}

		System.out.println(bfs(0, 0));
		
		for (int i = 0; i < N; i++) {
			System.out.println(Arrays.toString(map[i]));
		}
	}

	private static int bfs(int x, int y) {
		Queue<Integer[]> queue = new LinkedList<>();
		queue.offer(new Integer[] { x, y });

		while (!queue.isEmpty()) {
			x = queue.peek()[0];
			y = queue.peek()[1];
			System.out.println(x +", "+ y);
			queue.poll();

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx < 0 || nx >= N || ny < 0 || ny >= M)
					continue;
				if (map[nx][ny] == 0)
					continue;

				if (map[nx][ny] == 1) {
					map[nx][ny] = map[x][y] + 1;
					queue.offer(new Integer[] { nx, ny });
				}
			}
		}

		return map[N - 1][M - 1];
	}

}
