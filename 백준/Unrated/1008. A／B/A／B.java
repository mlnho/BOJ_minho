import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a = scanner.nextInt();
		double b = scanner.nextInt();

		//데이터의 정확도를 높이려면 float보다 double이 선호된다.
		//float - 소수7자리까지
		//double - 소수16자리까지
	
		System.out.println(a/b);
	}
}