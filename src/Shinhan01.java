import java.util.Arrays;

public class Shinhan01 {
	public int[] solution(int[] periods, int[][] payments, int[] estimates) {
		int[] answer = new int[2];

		for (int i = 0; i < periods.length; i++) {
			int period = periods[i];
			System.out.println(period);
			
			int now = payments[i][0];
			int next = estimates[i];
			for (int j = 1; j < 12; j++) {
				now += payments[i][j];
				next += payments[i][j];
			}
			System.out.println(now + ", " + next);
			
			
			if (period < 23) {
				System.out.println("다음달에 최대 23개월 되니까 절대불가");
				continue;
			} else if(period < 59) {
				System.out.println("다음달에 최대 24개월이 되니까 vip가능성 있음");
			} else {
				System.out.println("다음달에 최대 60개월이 되니까 vip가능성 있음");
				
			}
			
			
		}

		return answer;
	}

	public static void main(String[] args) {
		Shinhan01 T = new Shinhan01();

		int[] periods1 = { 8, 23, 24 };
		int[][] payments1 = {
				{ 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000 },
				{ 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000 },
				{ 350000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000 } };
		int[] estimates1 = { 100000, 100000, 100000 };
		System.out.println(Arrays.toString(T.solution(periods1, payments1, estimates1)));

//		int[] periods2 = { 24, 59, 59, 60 };
//		int[][] payments2 = { { 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000 },
//				{ 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000 },
//				{ 350000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000 },
//				{ 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000 } };
//		int[] estimates2 = { 350000, 50000, 40000, 50000 };
//		System.out.println(Arrays.toString(T.solution(periods2, payments2, estimates2)));
	}

}
