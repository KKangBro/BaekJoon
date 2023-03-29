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
		StringTokenizer st = new StringTokenizer(input.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(input.readLine());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		st = new StringTokenizer(input.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int left = 0, right = n - 1, rst = 0;
		while (left < right) {
			int sum = arr[left] + arr[right];

			if (sum == m) {
				System.out.println(arr[left] + ", " + arr[right]);
				rst++;
				right = n - 1;
				left++;
			}

			if (sum > m) {
				right--;
			} else {
				left++;
			}

		}

		System.out.println(rst);
	}

}
