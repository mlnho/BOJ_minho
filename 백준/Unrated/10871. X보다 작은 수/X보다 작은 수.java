import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		System.out.println("배열 몇개?");
		int numbers = scanner.nextInt(); // 배열 몇개 받을지 스캐너를 통해서 받는다.
//		System.out.println("x 몇??");
		int X = scanner.nextInt(); // 추후 배열에서 x보다 작은수를 거르기 위해 x를 받는다
		int arrays[] = new int[numbers]; // scanner로 받은 갯수를 배열의 갯수로 지정한다.

//  	모두 랜덤으로 받아야하기 때문에  for문을 사용한다.
		for (int i = 0; i < numbers; i++) {
			arrays[i] = scanner.nextInt();
		}
//		System.out.println(Arrays.toString(arrays));

		for (int i = 0; i < numbers; i++) {
			if (arrays[i] < X) {
			System.out.print(arrays[i] + " ");
			}
		}

	}
}