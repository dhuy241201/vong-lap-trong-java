import java.util.Scanner;

public class Th_tim_UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int numbera = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int numberb = scanner.nextInt();

        numbera = Math.abs(numbera);
        numberb = Math.abs(numberb);

        if (numbera == 0 && numberb == 0) {
            System.out.println("Mọi số nguyên đều là ước của hai số");
        } else if (numbera == 0 || numberb == 0) {
            System.out.println("Mọi số nguyên dương đều là ước của hai số");
        } else {
            while (numbera != numberb) {
                if (numbera > numberb) {
                    numbera = numbera - numberb;
                } else {
                    numberb = numberb - numbera;
                }
            }
            System.out.println("UCLN của hai số là: "+numbera);
        }
    }
}

