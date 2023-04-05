import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 바구니개수는 N개가 있다.
		int N = scanner.nextInt();
		int[] pocket = new int[N];

		// 공번호는 바구니번호와 같다. 각바구니에는 하나씩 있다.
		for (int i = 0; i < pocket.length; i++) {
			//+1하는 이유는 배열은 0부터 시작하기에 첫번째 바구니(0인덱스) 의 값이 1이 되야하기 때문이다.
			pocket[i] = i+1; 

		}
		//M개의 줄을 거쳐 공을 교환할 방법이 주어진다. 각방법은 두 정수 i,j로 이루어져있고 i번 바구니와 j번 바구니들어있는 공 교환
		
		int M = scanner.nextInt();
		
		// -1 하는 이유는 바구니는 0번인덱스부터 시작하기 때문에....(배열이였다.)
		for(int i = 0; i<M; i++) {
			//바꿀 바구니번호 2개 받기(참고로 공번호는 바구니 번호와 같다)
			int I = scanner.nextInt();
			int J = scanner.nextInt();
			
			
				int tmp = pocket[I-1];
				pocket[I-1] = pocket[J-1];
				pocket[J-1] = tmp;
//				System.out.print(pocket[i]);
		}
		for(int i=0; i<pocket.length; i++) {
			System.out.print(pocket[i] + " ");
		}
		
	}

}
