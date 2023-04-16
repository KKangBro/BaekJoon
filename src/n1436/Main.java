package n1436; // 영화감독 숌

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			6
			"""; // output: 5666
	
	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));
		
		int N = Integer.parseInt(input.readLine());
		int num = 665, cnt = 0;
		while(true) {
			if(cnt == N) {
				System.out.println(num);
				break;
			}
			
			num++;
			String str = String.valueOf(num);
			if(str.contains("666")) {
				cnt++;
			}
		}
	}
}
