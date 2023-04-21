import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		//시간초과를 막기위해
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 우선순위 큐(힙) 활용
		// Priority Queue 선언
		Queue<Integer> minheap = new PriorityQueue<Integer>();

		// 연산의 갯수를 받는 변수
		int n = Integer.parseInt(br.readLine());

		// 배열에 추가되는 숫자들 x
		int x;

		for (int i = 0; i < n; i++) {
			x = Integer.parseInt(br.readLine());
			if (x > 0) {
				minheap.offer(x);
			} else if (x == 0) {
				if (!minheap.isEmpty()) {
					// 만약 배열이 비어있는 경우에
					// priorityQueue에 첫번째 값(최솟값)을 반환하고 제거, 비어있다면 null
					System.out.println(minheap.poll());
				} else {
					// 배열이 비어 있는 경우인데 가장 작은 값을 출력하라고 한 경우에는 0을 출력
					System.out.println(0);

				}
			}
			
		} // last for
	}

}
