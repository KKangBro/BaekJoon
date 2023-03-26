package n11720;

import java.io.*;

public class Main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//    static StringBuilder output = new StringBuilder();
    static String inputStr = """
            5
            54321
            """;    // output: 15

    public static void main(String[] args) throws Exception {
        input = new BufferedReader(new StringReader(inputStr));

        int length = Integer.parseInt(input.readLine());
        String str = input.readLine();

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        System.out.println(sum);
    }
}
