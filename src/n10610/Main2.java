package n10610; // 30

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			102
			"""; // output : 210
	static List<String> list = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		String N = input.readLine();
		Character[] arr = new Character[N.length()];
		char[] cases = new char[N.length()];
		boolean[] visited = new boolean[N.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = N.charAt(i);
		}

		Arrays.sort(arr, Collections.reverseOrder());
		permutation(arr, cases, visited, 0);

		BigInteger rst = new BigInteger("-1");
		for (String str : list) {
			if (new BigInteger(str).remainder(new BigInteger("30")).equals(BigInteger.ZERO)) {
				rst = new BigInteger(str);
				break;
			}
		}

		System.out.println(rst);
	}

	public static void permutation(Character arr[], char cases[], boolean visited[], int depth) {
		if (depth == arr.length) {
			String str = "";
			for (int i = 0; i < arr.length; i++) {
				str += cases[i];
			}
			list.add(str);
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				cases[depth] = arr[i];
				permutation(arr, cases, visited, depth + 1);
				visited[i] = false;
			}
		}
	}

}
