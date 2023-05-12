import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());

		String num = br.readLine();
		int arr[] = new int[count];

		int sum = 0;
		
		
		for (int i = 0; i < count; i++) {
			arr[i] = num.charAt(i) - '0';
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
