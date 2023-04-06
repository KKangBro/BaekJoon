package n1969;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			5 8
			TATGATAC
			TAAGCTAC
			AAAGATCC
			TGAGATAC
			TAAGATGT
			"""; // output : TAAGATAC 7
	static Map<Character, Integer> map = new HashMap<>() {
		{
			put('A', 0);
			put('C', 1);
			put('G', 2);
			put('T', 3);
		}
	};

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		StringTokenizer st = new StringTokenizer(input.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[4][M];

		for (int i = 0; i < N; i++) {
			String str = input.readLine();

			for (int j = 0; j < M; j++) {
				char c = str.charAt(j);
				arr[map.get(c)][j]++;
			}
		}

		// https://url.kr/3bokuc
		String rstStr = "";
		for (int j = 0; j < M; j++) {
			int idx = -1, max = -1;
			for (int i = 0; i < 4; i++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
					idx = i;
				}
			}
			System.out.println(max);
			System.out.println(idx);
			System.out.println();
		}
		System.out.println(getKey(map, 0));

	}

	private static char[] getKey(Map<Character, Integer> map2, int i) {
		for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
	}
	

}
