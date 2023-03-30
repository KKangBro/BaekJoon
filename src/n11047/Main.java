package n11047; // 동전 0

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			10 4790
			1
			5
			10
			50
			100
			500
			1000
			5000
			10000
			50000
			"""; // output: 12

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		StringTokenizer st = new StringTokenizer(input.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] arr = new int[N + 1];
		for (int i = 1; i < N + 1; i++) {
			arr[i] = Integer.parseInt(input.readLine());
		}
//		System.out.println(Arrays.toString(arr));

		int rst = 0;
		while (K > 0) {
			if (K < arr[N]) {
				N--;
			} else if (K == arr[N]) {
				rst++;
				break;
			} else {
				rst += K / arr[N];
				K = K % arr[N];
				N--;
			}
		}
		System.out.println(rst);
	}

}
