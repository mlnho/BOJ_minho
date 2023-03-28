import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//배열 갯수 몇개로 할지 scanner로 받는다
		int tNumber = scanner.nextInt(); 
		int[] numbers = new int[tNumber];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		// 내가 찾고 싶은 값을 입력받기
		int findNumber = scanner.nextInt();
		// 찾은 값의 갯수를 올려줄 count 변수를 만든다.
		int count = 0;

		// 배열을 반복문을 통해 돌려보며 내가 찾고 싶은 수를 찾고 찾는다면 count를 올린다.
		for (int i = 0; i < numbers.length; i++) {
			if (findNumber == numbers[i]) {
				count += 1; // 찾았다면 count +1!
			}
		}
		System.out.println(count);

	}

}