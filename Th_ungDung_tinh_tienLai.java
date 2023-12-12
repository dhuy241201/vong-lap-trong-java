import java.util.Scanner;

public class Th_ungDung_tinh_tienLai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        money = input.nextDouble()        ;
        System.out.println("Enter number of months: ");
        month = input.nextInt();
        System.out.println("Enter anual rate");
        interestRate = input.nextDouble();

        double totalInerest = 0;
        for (int i = 0; i < month; i++){
            totalInerest += money * (interestRate/100/12) * month;
        }
        System.out.println("Total of interest: "+totalInerest);
    }
}
