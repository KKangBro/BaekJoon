package n2875; // 대회 or 인턴

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main2 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			6 10 3
			"""; // output: 3

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));
		
		StringTokenizer st = new StringTokenizer(input.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int rst = 0;
		while(true) {
			if(N >= 2 && M >= 1) {
				N -= 2;
				M -= 1;
				rst++;
//				System.out.println(N + ", " + M + " : " + rst);				
			} else
				break;
		}
		
		K -= N + M;
		if(rst > 0 && N + M < K) {
			int intern = K / 3 + (K % 3 == 0 ? 0 : 1);
			rst -= intern;
		}
		
		System.out.println(rst);
	}

}
