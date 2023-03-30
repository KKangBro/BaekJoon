package n1940; // 주몽

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main4 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			6
			9
			2 7 4 1 5 3
			"""; // output: 2

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int N = Integer.parseInt(input.readLine());
		int M = Integer.parseInt(input.readLine());

		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(input.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));

		int rst = 0;
		int left = 0;
		int right = N - 1;

		while (left < right) {
			int sum = arr[left] + arr[right];

			if (sum > M) {
				right--;
			} else if (sum < M) {
				left++;
			} else {
//				System.out.println(left + ", " + right);
				rst++;
				left++;
				right--;
			}
		}

		System.out.println(rst);
	}

}
