import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		
		//472 
		//385
//		2360, 3776, 1416, 181720
		Scanner scanner = new Scanner(System.in);

		
		
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a * (b%10));     //472*5(일의자리)가 필요하기 때문에 385에서 10을 나눈 후 나머지 값인 5를 구한다.
		System.out.println(a * (b%100/10));  // 472*8(십의자리)이 필요하기에 100으로나눈후 나머지를구하고 10을 나눈 후의 몫을구한다.
		System.out.println(a * (b/100)); 	// 472*3(백의자리)이 필요하기에 100으로 나눈후 몫을 구한다. 
		System.out.println(a * b); 
		
		
	}
}
