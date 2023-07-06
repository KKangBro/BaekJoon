package n1268; // 임시 반장 정하기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			5
			2 3 1 7 3
			4 1 9 6 8
			5 5 2 4 4
			6 5 2 6 7
			8 4 2 2 2
			"""; // output: 4

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int stu = Integer.parseInt(input.readLine());
		int[][] info = new int[stu][5];
		int[][] map = new int[stu][stu];

		for (int i = 0; i < stu; i++) {
			StringTokenizer st = new StringTokenizer(input.readLine());
			for (int j = 0; j < 5; j++)
				info[i][j] = Integer.parseInt(st.nextToken());
		}

//		for (int[] a : info)
//			System.out.println(Arrays.toString(a));

		for (int i = 0; i < 5; i++) { // 학년별
			for (int j = 0; j < stu; j++) { // 학생별
				for (int k = j + 1; k < stu; k++) { // 다음 학생과 비교
					if (info[j][i] == info[k][i]) {
						map[j][k] = 1;
						map[k][j] = 1;
					}
				}
			}
		}

//		for (int[] m : map)
//			System.out.println(Arrays.toString(m));

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < stu; i++) {
			int sum = 0;
			for (int j = 0; j < stu; j++)
				sum += map[i][j];
			list.add(sum);
		}
		System.out.println(list.indexOf(Collections.max(list)) + 1);
		
//		List<int[]> list = new ArrayList<>();
//		for (int i = 0; i < stu; i++) {
//			int sum = 0;
//			for (int j = 0; j < stu; j++)
//				sum += map[i][j];
//
//			list.add(new int[] { i, sum });
//		}
//
//		list.sort((a, b) -> {
//			int rst1 = b[1] - a[1];
//			int rst2 = a[0] - b[0];
//			if (rst1 == 0)
//				return rst2;
//			return rst1;
//		});
//		
//		for (int[] is : list) {
//			System.out.println(is[0] +", "+ is[1]);
//		}
	}
}
