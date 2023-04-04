import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

//N개의 바구니 만들기
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		int[] pocket = new int[N]; // ex) 0,1,2,3,4 - 5개

		//M개의 줄에 걸쳐 공을 넣는다.
		int M = scanner.nextInt();   	
		for (int i = 0; i < M; i++) {
			// I부터 J까지의 바구니에, K를 담는다.
			int I = scanner.nextInt();
			int J = scanner.nextInt();
			int K = scanner.nextInt();

//배열의 인덱스는 0부터 시작이다.
//따라서 만약사용자가 1~3까지의 바구니에 K를 넣고 싶다면
//반복문 시작인 i는 I(사용자 입력1~) 부터 J (3이라고 입력하지만 인덱스는 2번까지이다.)까지 하게된다. 

			for (int j = I - 1; j < J; j++) {
				pocket[j] = K;
			}
		}
//출력 반복문
		for (int i = 0; i < pocket.length; i++) {
			System.out.print(pocket[i] + " "); // 값 사이사이에 공백을 위해 " " 삽입
		}

	}
}