package n13458; // 시험 감독

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main2 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			5
			10 9 10 9 10
			7 2
			"""; // output: 1
	static int[] A;
	static int check;
	static int rst;

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int N = Integer.parseInt(input.readLine());

		A = new int[N];
		StringTokenizer st = new StringTokenizer(input.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(input.readLine());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		check = 0;
		rst = 0;
		run(B);
		
		while(check < N) {
			run(C);
		}

		System.out.println(rst);
	}

	private static void run(int num) {
		for (int i = 0; i < A.length; i++) {
			if(A[i] > 0) {
				A[i] -= num;
				rst++;
				
				if (A[i] <= 0)
					check++;
			}
		}
	}
}
