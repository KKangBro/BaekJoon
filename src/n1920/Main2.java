package n1920; // 수 찾기
//https://minhamina.tistory.com/127

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main2 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			5
			4 1 5 2 3
			5
			1 3 7 9 5
			"""; // output: 1 1 0 0 1
	static int[] arr;

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int N = Integer.parseInt(input.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(input.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int M = Integer.parseInt(input.readLine());
		st = new StringTokenizer(input.readLine());
		for (int i = 0; i < M; i++) {
			int target = Integer.parseInt(st.nextToken());
			if (contain(target, 0, N - 1)) {
				output.append(1 + "\n");
			} else {
				output.append(0 + "\n");
			}
		}

		System.out.println(output);
	}

	private static boolean contain(int target, int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (target > arr[mid]) {
				contain(target, mid + 1, high);
			} else if (target < arr[mid]) {
				contain(target, low, mid - 1);
			} else {
				return true;
			}
		}

		return false;
	}

}
