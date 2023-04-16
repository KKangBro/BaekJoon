package n17484; // 진우의 달 여행 (Small)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
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
	
	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));
		
		StringTokenizer st = new StringTokenizer(input.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N][M];
		for (int i = 0; i < N; i++) {
			map[i] = Arrays.stream(input.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		for (int i = 0; i < map.length; i++) {
			System.out.println(Arrays.toString(map[i]));
		}
		//----------------
		
		int[][] dp = new int[N+1][M];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < M; j++) {
				dp[i][j] = map[i][j];
			}
		}
		
		for (int i = 2; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int min = Integer.MAX_VALUE;
				if(j == 0) {
					min = Math.min(min, map[i-2][j] + map[i-1][j+1]);
					min = Math.min(min, map[i-2][j+1] + map[i-1][j]);
					min = Math.min(min, map[i-2][j+1] + map[i-1][j+1]);
				} else if(j == M-1) {
					min = Math.min(min, map[i-2][j-1] + map[i-1][j-1]);
					min = Math.min(min, map[i-2][j-1] + map[i-1][j]);
					min = Math.min(min, map[i-2][j] + map[i-1][j-1]);
				} else {
					min = Math.min(min, map[i-2][j-1] + map[i-1][j-1]);
					min = Math.min(min, map[i-2][j-1] + map[i-1][j]);
					min = Math.min(min, map[i-2][j] + map[i-1][j-1]);
					min = Math.min(min, map[i-2][j] + map[i-1][j+1]);
					min = Math.min(min, map[i-2][j+1] + map[i-1][j]);
					min = Math.min(min, map[i-2][j+1] + map[i-1][j+1]);
				}
				 
				dp[i][j] = min;
			}
			
		}
		System.out.println("==========");
		for (int i = 0; i < dp.length; i++) {
			System.out.println(Arrays.toString(dp[i]));
		}
		
	}

}
