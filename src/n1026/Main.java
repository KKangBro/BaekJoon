package n1026; // 보물

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			5
			1 1 1 6 0
			2 7 8 3 1
			"""; // output: 18

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));
		
		int N = Integer.parseInt(input.readLine());
		int[] A = Arrays.stream(input.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Integer[] B = new Integer[N];
		StringTokenizer st = new StringTokenizer(input.readLine());
		for (int i = 0; i < N; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		Arrays.sort(B, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		int rst = 0;
		for (int i = 0; i < N; i++) {
			rst += A[i] * B[i];
		}
		
		System.out.println(rst);
	}
}