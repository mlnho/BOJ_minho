import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 영수증에 적힌 총 금액
		int totalPrice = scanner.nextInt();
		// 영수증에 적힌 구매한 물건의 종류의 수
		int item = scanner.nextInt();
		int sum = 0; // 물건의 총합으로 영수증과 비교하기 위해 만든 변수

		// 물건의 종류의 수 만큼 for문을 돌린다
		for (int i = 1; i < item + 1; i++) {
			sum += scanner.nextInt() * scanner.nextInt();
		}
		if (totalPrice == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}