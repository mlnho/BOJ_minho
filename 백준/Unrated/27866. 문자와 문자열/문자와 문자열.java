import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//문자받기
		String str = sc.nextLine();

//문자에서 원하는 인덱스 값 받기
		String num = sc.nextLine();
		int i = Integer.parseInt(num);
		
		
//출력을 하지만 인덱스 개념이기에 -1을 해준다!		
		System.out.println(str.charAt(i-1));
		
		
		
	}
}
