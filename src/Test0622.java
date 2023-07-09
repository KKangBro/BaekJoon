
public class Test0622 {

	public static void main(String[] args) {
		String S = "NAABXXAN";

		int answer = 0;
		String str = new String(S);

		while (true) {
			int[] countArr = { 3, 1, 1 };
			char[] charArr = str.toCharArray();
			for (int i = 0; i < charArr.length; i++) {
				System.out.println(charArr[i]);
				if (charArr[i] == 'A') {
					charArr[i] = ' ';
					countArr[0] -= 1;
				}
				else if (charArr[i] == 'B') {
					charArr[i] = ' ';
					countArr[1] -= 1;
				}
				else if (charArr[i] == 'N') {
					charArr[i] = ' ';
					countArr[2] -= 1;
				}
			}
			if (countArr[0] < 0 || countArr[1] < 0 || countArr[2] < 0) {
				answer += 1;
				str = "";
				for(char c : charArr) {
					if(c == ' ') continue;
					str += c;
				}
			}
			else
				break;
		}

		System.out.println(answer);
	}
}
