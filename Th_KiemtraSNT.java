import java.util.Scanner;

public class Th_KiemtraSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter your number: ");
            number = scanner.nextInt();

            if (number < 2) {
                System.out.println("This is not a prime number");
            } else {
                int i = 2;
                boolean check = true;
                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check) {
                    System.out.println("This is a prime number");
                    System.out.println("");
                } else {
                    System.out.println("This is not a prime number");
                    System.out.println("");
                }
            }
        } while (number != 0);
    }
}
