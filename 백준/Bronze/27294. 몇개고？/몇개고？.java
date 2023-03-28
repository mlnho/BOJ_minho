import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		
		int time = scanner.nextInt(); int soju = scanner.nextInt();
		
		
		//점심식사 ~11 , 16~ + 술 x = 320개
		
		//점심식사 x = 280개
		//식사 + 술 = 280개
		
		
		if(16>=time && time>=12 && soju == 0 ) {
			System.out.println(320);
		} else { 
			System.out.println(280);
		}
		
	}
}
