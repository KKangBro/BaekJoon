package n11403; // 경로 찾기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main2 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			7
			0 0 0 1 0 0 0
			0 0 0 0 0 0 1
			0 0 0 0 0 0 0
			0 0 0 0 1 1 0
			1 0 0 0 0 0 0
			0 0 0 0 0 0 1
			0 0 1 0 0 0 0
			"""; // output: 1 1 1\n1 1 1\n1 1 1
	static int N;
	static int[][] map;
	static boolean[] visited;

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		N = Integer.parseInt(input.readLine());
		map = new int[N][N];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(input.readLine());
			for (int j = 0; j < N; j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < N; i++) {
			visited = new boolean[N];
			for (int j = 0; j < N; j++) {
				if(map[i][j] == 1 && !visited[j]) {
					dfs(i, j);
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				output.append(map[i][j]+" ");
			}
			output.append("\n");
		}
		System.out.println(output);
	}

	private static void dfs(int x, int y) {
		visited[y] = true;
		map[x][y] = 1;
		
		for (int i = 0; i < N; i++) {
			if(visited[i])
				continue;
			if(map[y][i] == 0)
				continue;
			
			dfs(x, i);
		}
	}
}
