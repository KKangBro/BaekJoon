package n1427; // 소트인사이드

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			2143
			"""; // output: 4321

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));
		String str = input.readLine();
		
		Integer[] arr = new Integer[str.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
		}
		
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		for (Integer i : arr) {
			output.append(i+"");
		}
		
		System.out.println(output);
	}

}
