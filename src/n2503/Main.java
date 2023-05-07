package n2503; // 숫자 야구

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			4
			123 1 1
			356 1 0
			327 2 0
			489 0 1
			"""; // output: 2

	static Integer[] arr = new Integer[3]; // 원소를 저장할 배열
	static List<List<Integer>> allList = new ArrayList<>();
	static boolean[] visited = new boolean[10]; // 중복을 제거하기 위한 방문 처리

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int N = Integer.parseInt(input.readLine());

		permutation(0);
//		System.out.println(allList);

		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(input.readLine());
			String question = st.nextToken();
			int strike = Integer.parseInt(st.nextToken());
			int ball = Integer.parseInt(st.nextToken());
			System.out.println(question);

			for (int k = 0; k < allList.size(); k++) {
				List<Integer> num = allList.get(k);
				String temp = "";
				for (Integer n : num) {
					temp += n + "";
				}
				int sCnt = 0, bCnt = 0;

				for (int j = 0; j < 3; j++) {
					char target = question.charAt(j);
					if (temp.contains(target + "")) {
						if (j == temp.indexOf(target))
							sCnt += 1;
						else
							bCnt += 1;
					}
				}
				
				System.out.println(sCnt);
				System.out.println(bCnt);
				
				if (sCnt != strike || bCnt != ball) {
					allList.remove(num);
				}
			}
		}

		System.out.println(allList);
	}

	private static void permutation(int cnt) {
		if (cnt == 3) {
			List<Integer> temp = new ArrayList<>(Arrays.asList(arr));
			allList.add(temp);
			return;
		}

		for (int i = 1; i <= 9; i++) {
			if (visited[i])
				continue;

			visited[i] = true;
			arr[cnt] = i;
			permutation(cnt + 1);
			visited[i] = false;
		}
	}
}
