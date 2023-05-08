package n2503; // 숫자 야구

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main3 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			4
			123 1 1
			356 1 0
			327 2 0
			489 0 1
			"""; // output: 2

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int N = Integer.parseInt(input.readLine());
		int[] question = new int[N];
		int[] strike = new int[N];
		int[] ball = new int[N];

		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(input.readLine());
			question[i] = Integer.parseInt(st.nextToken());
			strike[i] = Integer.parseInt(st.nextToken());
			ball[i] = Integer.parseInt(st.nextToken());
		}

		int rst = 0;
		for (int i = 123; i <= 987; i++) {
			int h = i / 100;
			int t = i / 10 % 10;
			int o = i % 10;

			if (h == t || t == o || h == o)
				continue;
			if (t == 0 || o == 0)
				continue;

			int cnt = 0;
			for (int j = 0; j < N; j++) {
				int qst = question[j];
				int sCnt = 0, bCnt = 0;

				if (qst / 100 == h)
					sCnt++;
				else if (qst / 100 == t)
					bCnt++;
				else if (qst / 100 == o)
					bCnt++;

				if (qst / 10 % 10 == h)
					bCnt++;
				else if (qst / 10 % 10 == t)
					sCnt++;
				else if (qst / 10 % 10 == o)
					bCnt++;

				if (qst % 10 == h)
					bCnt++;
				else if (qst % 10 == t)
					bCnt++;
				else if (qst % 10 == o)
					sCnt++;
				
				if(sCnt != strike[j] || bCnt != ball[j])
					break;
				
				cnt++;
				if(cnt == N)
					rst++;
			}
		}

		System.out.println(rst);
	}

}
