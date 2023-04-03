package n2875; // 대회 or 인턴

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			6 3 2
			"""; // output: 2

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));
		
		StringTokenizer st = new StringTokenizer(input.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int rst = 0;
		
		System.out.println(output);
	}

}
