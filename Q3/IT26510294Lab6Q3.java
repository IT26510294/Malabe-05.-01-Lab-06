import java.util.Scanner;

public class IT26510294Lab6Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, count = 0;
        double sum = 0;

        while (true) {
            System.out.print("Enter number: ");
            n = sc.nextInt();

            if (n == -99)
                break;

            if (n < 0) {
                System.out.println("Invalid number");
                continue;
            }

            sum = sum + n * n;
            count++;
        }

        double rms = Math.sqrt(sum / count);

        System.out.println("RMS = " + rms);
    }
}

