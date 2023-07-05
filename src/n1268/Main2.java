package n1268; // 임시 반장 정하기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main2 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			5
			1 1 1 1 1 
			2 2 2 2 2 
			3 3 3 3 3 
			4 4 4 4 4 
			5 5 5 5 5 
			"""; // output: 4

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int stu = Integer.parseInt(input.readLine());
		int[][] map = new int[stu][5];
		HashMap<Integer, Integer> rst = new HashMap<>();

		for (int i = 0; i < stu; i++) {
			StringTokenizer st = new StringTokenizer(input.readLine());
			for (int j = 0; j < 5; j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}

//		for (int[] m : map)
//			System.out.println(Arrays.toString(m));

		for (int i = 0; i < 5; i++) {
			int[] counts = new int[10];
			for (int j = 0; j < stu; j++)
				counts[map[j][i]] += 1;
//			System.out.println(Arrays.toString(counts));

			for (int idx = 1; idx < 10; idx++) {
				if (counts[idx] < 2) continue;

//				System.out.println("OK! " + idx);
				for (int j = 0; j < stu; j++) {
					if (map[j][i] != idx) continue;

					rst.put(j, rst.getOrDefault(j, 0) + 1);
				}
			}
//			System.out.println(rst);
		}

		List<int[]> list = new ArrayList<>();
		for (int key : rst.keySet())
			list.add(new int[] { key, rst.get(key) });

		list.sort((a, b) -> {
			int rst1 = b[1] - a[1];
			int rst2 = a[0] - b[0];
			if (rst1 == 0)
				return rst2;
			return rst1;
		});

//		System.out.println(list.size());
//		for (int[] is : list)
//			System.out.println(is[0] + ", " + is[1]);
		
		System.out.println((list.size() == 0 ? 0 :list.get(0)[0]) + 1);
	}
}
