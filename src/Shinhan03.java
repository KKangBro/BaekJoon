public class Shinhan03 { // 마이너스 통장의 잔고액
	public int solution(int m, int[] ledger) {
		int answer = 0;

		for (int money : ledger) {
//			System.out.println("money: " + money);
			answer += money;
//			System.out.println("sum: " + answer);

			if (answer < -1 * m) {
				answer -= money;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Shinhan03 T = new Shinhan03();

		int m1 = 5000;
		int[] ledger1 = { 10000, -13000, -4000, -2000, 6500, -20000 };
		System.out.println(T.solution(m1, ledger1));
		int m2 = 34151;
		int[] ledger2 = { -34152, -40000, -50000 };
		System.out.println(T.solution(m2, ledger2));
	}
}
