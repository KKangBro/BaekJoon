import java.util.LinkedList;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
		Queue<Character> queue = new LinkedList<>();
		queue.offer('a');
		queue.offer('b');
		
		System.out.println(queue);
	}

}
