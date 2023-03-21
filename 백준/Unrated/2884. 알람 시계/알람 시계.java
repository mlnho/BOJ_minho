import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int h = scanner.nextInt(); // 시간
		int m = scanner.nextInt(); // 분

		// 45분전으로 돌려야하니깐 입력된 분에다가 -45를 해야한다.
		m = m - 45;
		// 근데 이러면 m이 -가 되기때문에 +60을 해줘야한다!!
		// 왜냐하면 15분으로 설정시 -45 하면 -30이되고 +60을하면30이 되서 내가 일어나야할 분이 된다.

		// 자그렇다면 분설정도 해줘야한다
		if (m < 0) { // m이 0보다 작게된다면?? 앞서서 -했다.
			h--; // 시간에서도 1을 빼줘야한다!! 45분 전으로 설정했기떄문에
			m = m + 60; // 앞서 마이너스했던거에 60더해준것
			if (h < 0) {
				h = 23;
			}


		}
		System.out.println(h + " " + m);
	}
}