import java.util.Scanner;

public class Function {
    private static int turned;

    public static int turnover(int digit) {
        if(digit > 0) {
            turned *= 10;
            turned += digit % 10;
            digit /= 10;
            return turnover(digit);
        }
        else {
            return turned;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(turnover(scan.nextInt()));
    }
}