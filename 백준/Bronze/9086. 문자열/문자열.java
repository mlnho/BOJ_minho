import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {
			String str = scanner.next();
			System.out.println(str.charAt(0) + "" + str.charAt(str.length() - 1));
		} // last for

	}
}
