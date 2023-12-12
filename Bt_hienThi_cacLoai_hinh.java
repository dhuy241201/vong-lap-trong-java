import java.util.Scanner;

public class Bt_hienThi_cacLoai_hinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle bottom-left");
        System.out.println("3. Print the square triangle top-left");
        System.out.println("4. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                for(int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    System.out.println();
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 3:
                for (int i = 5; i > 0; i--) {
                    System.out.println();
                    for (int j = i; j > 0; j--) {
                        System.out.print("*");
                    }
                }
                break;
            case 4:
                System.out.println("   *");
                System.out.println("  ***");
                System.out.println(" ******");
                System.out.println("********");
        }
    }
}
