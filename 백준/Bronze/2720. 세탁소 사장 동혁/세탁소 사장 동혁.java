import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;


        for (int i = 0; i < T; i++) {
            int money = scanner.nextInt();
            int q_count = money / quarter;
            int d_count = money % quarter / dime;
            int n_count = money % quarter % dime / nickel;
            int p_count = money % quarter % dime % nickel;

            System.out.println("" + q_count + " " + d_count + " " + n_count + " " + p_count);
        }


    }
}