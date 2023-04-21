import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		//시간초과를 막기위해
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// [최대] 우선순위 큐(힙) 활용
		// Priority Queue 선언
		PriorityQueue<Integer> maxheap = new PriorityQueue<>(Comparator.reverseOrder());

		// 연산의 갯수를 받는 변수
		int n = Integer.parseInt(br.readLine());

		// 연산 정보 나타내는 정수 x
		int x;

		for (int i = 0; i < n; i++) {
			x = Integer.parseInt(br.readLine());
			if (x > 0) {
				maxheap.offer(x);
			// x가 0일 경우에 출력하기에 여기 아래로 출력 조건문을 달았다.
			} else if (x == 0) {
				if (!maxheap.isEmpty()) {
					// 만약 배열이 비어있지 않다면
					// priorityQueue에 첫번째 값(최솟값)을 반환하고 제거, 비어있다면 null
					System.out.println(maxheap.poll());
				} else {
					// 배열이 비어 있는 경우인데 0을 출력
					System.out.println(0);

				}
			}
			
		} // last for
	}

}
