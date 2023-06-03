import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int quest1 = sc.nextInt();
        int quest2 = sc.nextInt();
        int num = 0;
        int result1 = 0;
        int result2 = 0;

        while (quest2 > 0) {
            result1 = result1 * 10 + quest2 % 10;
            quest2 /= 10;
        }

        while (quest1 > 0) {
            result2 = result2 * 10 + quest1 % 10;
            quest1 /= 10;

        }

        if(result2>result1){
            System.out.println(result2);
        } else {
            System.out.println(result1);
        }



    }
}