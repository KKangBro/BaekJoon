package n2018; // 수들의 합 5

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			15
			"""; // output: 4

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		StringTokenizer st = new StringTokenizer(input.readLine());
		int num = Integer.parseInt(st.nextToken());
		int[] arr = IntStream.range(1, num + 1).toArray();	// 1 ~ 15
		
//		System.out.println(Arrays.toString(arr));
		
		int left = 0, right = 0, sum = 0, rst = 0;
		while (left < num) {
			if (sum == num)
				rst++;

			if (sum >= num || right == num) {
				sum -= arr[left];
				left++;
			} else {
				sum += arr[right];
				right++;
			}

		}
		System.out.println(rst);

	}

}
