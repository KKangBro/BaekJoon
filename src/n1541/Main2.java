package n1541; // 잃어버린 괄호

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main2 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			55-50+40
			"""; // output: -35

	public static void main(String[] args) throws Exception {
		// Stringtokenizer로 "-"로 자르고 그 안은 "+"로 자르면서 연산
		input = new BufferedReader(new StringReader(src));
		
		int cnt = 1, rst = 0;
		StringTokenizer subSt = new StringTokenizer(input.readLine(), "-");
		while(subSt.hasMoreTokens()) {
			String str = subSt.nextToken();
			
			int temp = 0;
			StringTokenizer plusSt = new StringTokenizer(str, "+");
			while(plusSt.hasMoreTokens()) {
				temp += Integer.parseInt(plusSt.nextToken());
			}
			
			if(cnt == 1)
				rst = temp;
			else
				rst -= temp;
			
			cnt++;
		}
		System.out.println(rst);
	}
}