package n11724; // 연결 요소의 개수 - 다시 풀기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main2 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			6 5
			1 2
			2 5
			5 1
			3 4
			4 6
			"""; // output: 2
	static ArrayList<Integer>[] graph;
	static boolean[] visited;

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		StringTokenizer st = new StringTokenizer(input.readLine());
		int node = Integer.parseInt(st.nextToken());
		int edge = Integer.parseInt(st.nextToken());

		graph = new ArrayList[node + 1];
		for (int i = 1; i <= node; i++)
			graph[i] = new ArrayList<>();
		visited = new boolean[node + 1];

		for (int i = 0; i < edge; i++) {
			st = new StringTokenizer(input.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			graph[u].add(v);
			graph[v].add(u);
		}

		int count = 0;
		for (int i = 1; i <= node; i++) {
			if (!visited[i]) {
				count++;
				dfs(i);
			}
		}

		System.out.println(count);
	}

	private static void dfs(int k) {
		visited[k] = true;
		for (Integer next : graph[k]) {
			if (!visited[next])
				dfs(next);
		}
	}
}
