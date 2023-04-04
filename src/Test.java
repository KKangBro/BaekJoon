import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
//		Queue<Character> queue = new LinkedList<>();
//		queue.offer('a');
//		queue.offer('b');
//		
//		System.out.println(queue);
		
		//-------
		
//		Map<Character, Integer> map = new HashMap<>();
		
		//--------
		
		String str = "10 9 10 9 10";
		int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
		
		System.out.println(Arrays.toString(arr));
		
	}

}
