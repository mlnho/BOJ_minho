import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

		 
		 int N = sc.nextInt();
		 //A+B의 합을 담을 배열을 만들었따. 
		 int [] array = new int[N];
		 
		 for(int i = 0; i<N; i++) {
			 int A = sc.nextInt();
			 int B = sc.nextInt();
			 
			 array[i] = A+B;
		 }
		   
		 for(int i = 0; i<N; i++) {
			 System.out.println("Case #"+(i+1)+": " + array[i]);
			 
		 }
	    }
	}
