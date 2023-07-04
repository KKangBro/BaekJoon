package n1268;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			5
			2 3 1 7 3
			4 1 9 6 8
			5 5 2 4 4
			6 5 2 6 7
			8 4 2 2 2
			"""; // output: 4

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));
		
		int stu = Integer.parseInt(input.readLine());
		int[][] map = new int[stu][5];
//		boolean[] count = new boolean[stu];
		
		for (int i = 0; i < stu; i++) {
			StringTokenizer st = new StringTokenizer(input.readLine());
			for (int j = 0; j < 5; j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for (int j = 0; j < 5; j++) {
			int[] counts = new int[10];
			for (int i = 0; i < stu; i++)
				counts[map[i][j]] += 1;
			
			for (int count : counts) {
				if(count < 2) continue; 
				
				
				
				
			}
			
		}
		

		
	}
	
	

}
