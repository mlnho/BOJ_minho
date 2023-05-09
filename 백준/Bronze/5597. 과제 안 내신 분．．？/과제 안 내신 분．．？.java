import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[30];

		for (int i = 0; i < 28; i++) {
			int userNumber = scanner.nextInt();
			arr[userNumber - 1] = 1;
		}

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 1) {
				System.out.println((j + 1));
			}
		}

	}
}
